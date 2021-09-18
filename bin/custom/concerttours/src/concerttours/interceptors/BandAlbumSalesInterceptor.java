package concerttours.interceptors;

import concerttours.events.BandAlbumSalesEvent;
import concerttours.model.BandModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import javax.annotation.Resource;

import static de.hybris.platform.servicelayer.model.ModelContextUtils.getItemModelContext;

public class BandAlbumSalesInterceptor implements ValidateInterceptor, PrepareInterceptor {
    private static final long BIG_SALES = 50000L;
    private static final long NEGATIVE_SALES = 0L;
    @Resource
    private EventService eventService;

    @Override
    public void onValidate(Object model, InterceptorContext ctx) throws InterceptorException {
        if (model instanceof BandModel) {
            BandModel band = (BandModel) model;
            Long sales = band.getAlbumSales();
            if (sales != null && sales < NEGATIVE_SALES) {
                throw new InterceptorException("Album sales must be positive");
            }
        }
    }

    @Override
    public void onPrepare(Object model, InterceptorContext ctx) {
        if (model instanceof BandModel) {
            BandModel band = (BandModel) model;
            if (hasBecomeBig(band, ctx)) {
                eventService.publishEvent(new BandAlbumSalesEvent(band.getCode(), band.getName(), band.getAlbumSales()));
            }
        }
    }

    private boolean hasBecomeBig(BandModel band, InterceptorContext ctx) {
        Long sales = band.getAlbumSales();
        if (sales != null && sales >= BIG_SALES) {
            if (ctx.isNew(band)) {
                return true;
            } else {
                Long oldValue = getItemModelContext(band).getOriginalValue(BandModel.ALBUMSALES);
                return oldValue == null || oldValue.intValue() < BIG_SALES;
            }
        }
        return false;
    }
}