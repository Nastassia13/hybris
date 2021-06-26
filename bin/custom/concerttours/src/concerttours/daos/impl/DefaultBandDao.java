package concerttours.daos.impl;

import concerttours.daos.BandDao;
import concerttours.model.BandModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

public class DefaultBandDao extends AbstractItemDao implements BandDao {

    @Override
    public List<BandModel> findBands() {
        FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {pk} FROM {Band}");
        return getFlexibleSearchService().<BandModel>search(query).getResult();
    }

    @Override
    public List<BandModel> findBandsByCode(String code) {
        FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {pk} FROM {Band} WHERE {code} = ?code");
        query.addQueryParameter("code", code);
        return getFlexibleSearchService().<BandModel>search(query).getResult();
    }
}
