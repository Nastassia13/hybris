package concerttours.daos.impl;

import concerttours.daos.DateTokenDao;
import concerttours.model.DateTokenModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

public class DefaultDateTokenDao extends AbstractItemDao implements DateTokenDao {
    @Override
    public List<DateTokenModel> findTokens() {
        FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {pk} FROM {DateToken}");
        return getFlexibleSearchService().<DateTokenModel>search(query).getResult();
    }

    @Override
    public void saveToken(DateTokenModel dateToken) {
        getModelService().save(dateToken);
    }
}
