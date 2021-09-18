package concerttours.converters;

import concerttours.data.ConcertData;
import concerttours.enums.ConcertType;
import concerttours.model.ConcertModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConcertConverter implements Converter<ConcertModel, ConcertData> {
    @Override
    public ConcertData convert(ConcertModel concertModel) throws ConversionException {
        return convert(concertModel, new ConcertData());
    }

    @Override
    public ConcertData convert(ConcertModel concertModel, ConcertData concertData) throws ConversionException {
        concertData.setId(concertModel.getCode());
        concertData.setDate(concertModel.getDate());
        concertData.setVenue(concertModel.getVenue());
        concertData.setType(concertModel.getConcertType() == ConcertType.OPENAIR ? "Outdoors" : "Indoors");
        return concertData;
    }
}
