package concerttours.facades.impl;

import concerttours.data.ConcertData;
import concerttours.data.ProducerData;
import concerttours.facades.ConcertFacade;
import concerttours.model.ConcertModel;
import concerttours.model.ProducerModel;
import concerttours.service.ConcertService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DefaultConcertFacade implements ConcertFacade {
    private ConcertService concertService;
    @Resource
    private Converter<ConcertModel, ConcertData> concertConverter;
    @Resource
    private Converter<ProducerModel, ProducerData> producerConverter;

    @Override
    public List<ConcertData> getConcerts() {
        List<ConcertModel> concertModels = concertService.getConcerts();
        List<ConcertData> concertDatas = new ArrayList<>();
        concertModels.forEach(concertModel -> concertDatas.add(findConcertData(concertModel)));
        return concertDatas;
    }

    @Override
    public ConcertData getConcert(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Concert code cannot be null");
        }
        ConcertModel concertModel = concertService.getConcertForCode(code);
        if (concertModel == null) {
            return null;
        }
        return findConcertData(concertModel);
    }

    private ConcertData findConcertData(ConcertModel concertModel) {
        ConcertData concertData = concertConverter.convert(concertModel);
        concertData.setProducer(producerConverter.convert(concertModel.getProducer()));
        return concertData;
    }

    @Required
    public void setConcertService(ConcertService concertService) {
        this.concertService = concertService;
    }
}
