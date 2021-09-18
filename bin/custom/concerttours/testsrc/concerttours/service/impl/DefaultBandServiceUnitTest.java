package concerttours.service.impl;

import concerttours.daos.BandDao;
import concerttours.model.BandModel;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.StubLocaleProvider;
import de.hybris.platform.servicelayer.model.ItemModelContextImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@UnitTest
public class DefaultBandServiceUnitTest {
    private static final String BAND_CODE = "Ch00X";
    private static final String BAND_NAME = "Singers All";
    private static final String BAND_HISTORY = "Medieval choir formed in 2001, based in Munich famous for authentic monastic chants";

    private DefaultBandService bandService;
    private BandDao bandDao;
    private BandModel bandModel;

    @Before
    public void setUp() {
        bandService = new DefaultBandService();
        bandDao = mock(BandDao.class);
        bandService.setBandDao(bandDao);
        bandModel = new BandModel();
        ((ItemModelContextImpl) (bandModel.getItemModelContext()))
                .setLocaleProvider(new StubLocaleProvider(Locale.ENGLISH));
        bandModel.setCode(BAND_CODE);
        bandModel.setName(BAND_NAME);
        bandModel.setAlbumSales(1000L);
        bandModel.setHistory(BAND_HISTORY);
    }

    @Test
    public void testGetAllBands() {
        List<BandModel> bandModels = Arrays.asList(bandModel);
        when(bandDao.findBands()).thenReturn(bandModels);
        List<BandModel> result = bandService.getBands();
        assertEquals("We should find one", 1, result.size());
        assertEquals("And should equals what the mock returned", bandModel, result.get(0));
    }

    @Test
    public void testGetBand() {
        when(bandDao.findBandsByCode(BAND_CODE)).thenReturn(Collections.singletonList(bandModel));
        BandModel result = bandService.getBandForCode(BAND_CODE);
        assertEquals("Band should equals() what the mock returned", bandModel, result);
    }
}
