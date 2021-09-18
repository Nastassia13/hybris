package concerttours.daos.impl;

import concerttours.daos.NewsDao;
import concerttours.model.NewsModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

public class DefaultNewsDao extends AbstractItemDao implements NewsDao {
    @Override
    public List<NewsModel> findNews() {
        FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {pk} FROM {News}");
        return getFlexibleSearchService().<NewsModel>search(query).getResult();
    }
}
