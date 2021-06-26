package concerttours.daos;

import concerttours.model.BandModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface BandDao {
    List<BandModel> findBands();

    List<BandModel> findBandsByCode(String code);
}
