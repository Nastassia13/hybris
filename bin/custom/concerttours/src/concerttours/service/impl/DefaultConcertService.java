package concerttours.service.impl;

import concerttours.daos.ConcertDao;
import concerttours.model.ConcertModel;
import concerttours.service.ConcertService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class DefaultConcertService implements ConcertService {
    private ConcertDao concertDao;

    @Override
    public List<ConcertModel> getConcerts() {
        return concertDao.findConcerts();
    }

    @Override
    public ConcertModel getConcertForCode(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Concert code cannot be null");
        }
        List<ConcertModel> result = concertDao.findConcertsByCode(code);
        if (result.isEmpty()) {
            throw new UnknownIdentifierException("Concert with code '" + code + "' not found!");
        } else if (result.size() > 1) {
            throw new AmbiguousIdentifierException("Concert code '" + code + "' is not unique, "
                    + result.size() + " concerts found!");
        }
        return result.get(0);
    }

    @Required
    public void setConcertDao(ConcertDao concertDao) {
        this.concertDao = concertDao;
    }
}
