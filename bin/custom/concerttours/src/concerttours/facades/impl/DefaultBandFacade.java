package concerttours.facades.impl;

import concerttours.data.BandData;
import concerttours.data.TourSummaryData;
import concerttours.facades.BandFacade;
import concerttours.model.BandModel;
import concerttours.service.BandService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DefaultBandFacade implements BandFacade {
    private BandService bandService;
    @Resource
    private Converter<BandModel, BandData> bandConverter;

    @Override
    public List<BandData> getBands() {
        List<BandModel> bandModels = bandService.getBands();
        List<BandData> bandFacadeData = new ArrayList<>();
        for (BandModel bandModel : bandModels) {
            BandData bandData = bandConverter.convert(bandModel);
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
        BandData bandData = bandConverter.convert(bandModel);
        bandData.setTours(findTourSummaryData(bandModel));
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

    @Required
    public void setBandService(BandService bandService) {
        this.bandService = bandService;
    }
}
