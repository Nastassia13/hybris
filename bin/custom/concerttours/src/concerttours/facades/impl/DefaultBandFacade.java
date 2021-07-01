package concerttours.facades.impl;

import concerttours.data.BandData;
import concerttours.data.TourSummaryData;
import concerttours.facades.BandFacade;
import concerttours.model.BandModel;
import concerttours.service.BandService;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.media.MediaService;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DefaultBandFacade implements BandFacade {
    private static final String BAND_LIST_FORMAT = "band.list.format.name";
    private static final String BAND_DETAIL_FORMAT = "band.detail.format.name";
    private BandService bandService;
    private MediaService mediaService;
    private ConfigurationService configService;
    @Resource
    private Converter<BandModel, BandData> bandConverter;

    @Override
    public List<BandData> getBands() {
        List<BandModel> bandModels = bandService.getBands();
        List<BandData> bandFacadeData = new ArrayList<>();
        String mediaFormatName = configService.getConfiguration().getString(BAND_LIST_FORMAT);
        MediaFormatModel format = mediaService.getFormat(mediaFormatName);
        for (BandModel bandModel : bandModels) {
            BandData bandData = bandConverter.convert(bandModel);
            bandData.setImageURL(getImageURL(bandModel, format));
            bandFacadeData.add(bandData);
        }
        return bandFacadeData;
    }

    @Override
    public BandData getBand(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Band code cannot be null");
        }
        BandModel bandModel = bandService.getBandForCode(code);
        if (bandModel == null) {
            return null;
        }
        String mediaFormatName = configService.getConfiguration().getString(BAND_DETAIL_FORMAT);
        MediaFormatModel format = mediaService.getFormat(mediaFormatName);
        BandData bandData = bandConverter.convert(bandModel);
        bandData.setTours(findTourSummaryData(bandModel));
        bandData.setImageURL(getImageURL(bandModel, format));
        return bandData;
    }

    private List<TourSummaryData> findTourSummaryData(BandModel bandModel) {
        List<TourSummaryData> tourHistory = new ArrayList<>();
        if (bandModel.getTours() != null) {
            for (ProductModel tour : bandModel.getTours()) {
                TourSummaryData summary = new TourSummaryData();
                summary.setId(tour.getCode());
                summary.setTourName(tour.getName(Locale.ENGLISH));
                summary.setNumberOfConcerts(Integer.toString(tour.getVariants().size()));
                tourHistory.add(summary);
            }
        }
        return tourHistory;
    }

    private String getImageURL(BandModel bandModel, MediaFormatModel format) {
        MediaContainerModel container = bandModel.getImage();
        if (container != null) {
            return mediaService.getMediaByFormat(container, format).getDownloadURL();
        }
        return null;
    }

    @Required
    public void setBandService(BandService bandService) {
        this.bandService = bandService;
    }

    public void setMediaService(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    public void setConfigService(ConfigurationService configService) {
        this.configService = configService;
    }
}
