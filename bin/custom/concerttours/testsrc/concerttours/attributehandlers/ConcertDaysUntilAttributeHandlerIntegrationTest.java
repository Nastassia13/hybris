package concerttours.attributehandlers;

import concerttours.model.ConcertModel;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

@IntegrationTest
public class ConcertDaysUntilAttributeHandlerIntegrationTest extends ServicelayerTransactionalTest {
    @Resource
    private ModelService modelService;

    @Test
    public void testGetFutureConcertDate() {
        ConcertModel concert = modelService.create(ConcertModel.class);
        Date futureDate = new Date(new Date().getTime() + 49 * 60 * 60 * 1000);
        concert.setDate(futureDate);
        Assert.assertEquals("Wrong value for concert in the future: " + concert.getDaysUntil(),
                2L, concert.getDaysUntil().longValue());
    }

    @Test
    public void testGetNullConcertDate() {
        ConcertModel concert = modelService.create(ConcertModel.class);
        Assert.assertNull("No concert date does not return null: " + concert.getDaysUntil(),
                concert.getDaysUntil());
    }

    @Test
    public void testGetPastConcertDate() {
        ConcertModel concert = modelService.create(ConcertModel.class);
        Date pastDate = new Date(new Date().getTime() - 24 * 60 * 60 * 1000);
        concert.setDate(pastDate);
        Assert.assertEquals("Wrong value for concert in the past: " + concert.getDaysUntil(),
                0L, concert.getDaysUntil().longValue());
    }
}
