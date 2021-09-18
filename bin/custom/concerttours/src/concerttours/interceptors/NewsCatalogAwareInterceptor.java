package concerttours.interceptors;

import concerttours.model.NewsModel;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;

public class NewsCatalogAwareInterceptor implements PrepareInterceptor {
    private String defaultCatalog;
    private String defaultCatalogVersion;
    private CatalogVersionService catalogVersionService;
    private KeyGenerator keyGenerator;

    @Override
    public void onPrepare(Object model, InterceptorContext ctx) {
        if (model instanceof NewsModel) {
            NewsModel news = (NewsModel) model;
            if (StringUtils.isBlank(news.getId())) {
                news.setId(createNewsId());
            }
            if (news.getCatalogVersion() == null) {
                news.setCatalogVersion(getDefaultCatalogVersion());
            }
        }
    }

    private String createNewsId() {
        return keyGenerator.generate().toString();
    }

    private CatalogVersionModel getDefaultCatalogVersion() {
        return catalogVersionService.getCatalogVersion(defaultCatalog, defaultCatalogVersion);
    }

    @Required
    public void setDefaultCatalog(String defaultCatalog) {
        this.defaultCatalog = defaultCatalog;
    }

    @Required
    public void setDefaultCatalogVersion(String defaultCatalogVersion) {
        this.defaultCatalogVersion = defaultCatalogVersion;
    }

    @Required
    public void setKeyGenerator(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

    @Required
    public void setCatalogVersionService(CatalogVersionService catalogVersionService) {
        this.catalogVersionService = catalogVersionService;
    }
}
