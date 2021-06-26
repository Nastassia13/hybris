package concerttours.service.impl;

import concerttours.daos.BandDao;
import concerttours.model.BandModel;
import concerttours.service.BandService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DefaultBandService implements BandService {
    @Resource
    private BandDao bandDao;

    @Override
    public List<BandModel> findBands() {
        return bandDao.findBands();
    }

    @Override
    public BandModel findBandForCode(String code) {
        List<BandModel> result = bandDao.findBandsByCode(code);
        if (result.isEmpty()) {
            throw new UnknownIdentifierException("Band with code '" + code + "' not found!");
        } else if (result.size() > 1) {
            throw new AmbiguousIdentifierException("Band code '" + code + "' is not unique, " + result.size() + " bands found!");
        }
        return result.get(0);
    }
}
