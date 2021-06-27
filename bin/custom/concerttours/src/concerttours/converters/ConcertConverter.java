package concerttours.converters;

import concerttours.data.ConcertSummaryData;
import concerttours.enums.ConcertType;
import concerttours.model.ConcertModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConcertConverter implements Converter<ConcertModel, ConcertSummaryData> {
    @Override
    public ConcertSummaryData convert(ConcertModel concertModel) throws ConversionException {
        return convert(concertModel, new ConcertSummaryData());
    }

    @Override
    public ConcertSummaryData convert(ConcertModel concertModel, ConcertSummaryData concertSummaryData) throws ConversionException {
        concertSummaryData.setId(concertModel.getCode());
        concertSummaryData.setDate(concertModel.getDate());
        concertSummaryData.setVenue(concertModel.getVenue());
        concertSummaryData.setType(concertModel.getConcertType() == ConcertType.OPENAIR ? "Outdoors" : "Indoors");
        return concertSummaryData;
    }
}
