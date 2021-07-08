package concerttours.daos.impl;

import concerttours.daos.ConcertDao;
import concerttours.model.ConcertModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

public class DefaultConcertDao extends AbstractItemDao implements ConcertDao {
    private static final String FIND_ALL = "SELECT {" + ConcertModel.PK + "} FROM {" + ConcertModel._TYPECODE + "}";
    private static final String FIND_BY_CODE = "SELECT {" + ConcertModel.PK + "} FROM {" + ConcertModel._TYPECODE
            + "} WHERE {" + ConcertModel.CODE + "} = ?code";

    @Override
    public List<ConcertModel> findConcerts() {
        FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_ALL);
        return getFlexibleSearchService().<ConcertModel>search(query).getResult();
    }

    @Override
    public List<ConcertModel> findConcertsByCode(String code) {
        FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_BY_CODE);
        query.addQueryParameter("code", code);
        return getFlexibleSearchService().<ConcertModel>search(query).getResult();
    }
}
