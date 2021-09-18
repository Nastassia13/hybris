package concerttours.converters;

import concerttours.data.BandData;
import concerttours.model.BandModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BandConverter implements Converter<BandModel, BandData> {
    @Override
    public BandData convert(BandModel bandModel) throws ConversionException {
        return convert(bandModel, new BandData());
    }

    @Override
    public BandData convert(BandModel bandModel, BandData bandData) throws ConversionException {
        bandData.setId(bandModel.getCode());
        bandData.setName(bandModel.getName());
        bandData.setDescription(bandModel.getHistory());
        bandData.setAlbumsSold(bandModel.getAlbumSales());
        if (bandModel.getTypes() != null) {
            bandData.setGenres(bandModel.getTypes().getCode());
        }
        return bandData;
    }
}
