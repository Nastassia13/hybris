package concerttours.converters;

import concerttours.data.ProducerData;
import concerttours.model.ProducerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProducerConverter implements Converter<ProducerModel, ProducerData> {
    @Override
    public ProducerData convert(ProducerModel producerModel) throws ConversionException {
        return convert(producerModel, new ProducerData());
    }

    @Override
    public ProducerData convert(ProducerModel producerModel, ProducerData producerData) throws ConversionException {
        producerData.setId(producerModel.getCode());
        producerData.setName(producerModel.getName());
        return producerData;
    }
}
