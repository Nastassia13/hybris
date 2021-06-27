package concerttours.facades.impl;

import concerttours.data.ConcertSummaryData;
import concerttours.data.TourData;
import concerttours.facades.TourFacade;
import concerttours.model.ConcertModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.variants.model.VariantProductModel;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourFacade implements TourFacade {
    private ProductService productService;
    @Resource
    private Converter<ConcertModel, ConcertSummaryData> concertConverter;
    @Resource
    private Converter<ProductModel, TourData> tourConverter;

    @Override
    public TourData getTourDetails(String tourId) {
        if (tourId == null) {
            throw new IllegalArgumentException("Tour id cannot be null");
        }
        ProductModel product = productService.getProductForCode(tourId);
        if (product == null) {
            return null;
        }
        TourData tourData = tourConverter.convert(product);
        tourData.setConcerts(findConcertSummaryData(product));
        return tourData;
    }

    private List<ConcertSummaryData> findConcertSummaryData(ProductModel product) {
        List<ConcertSummaryData> concerts = new ArrayList<>();
        if (product.getVariants() != null) {
            for (VariantProductModel variant : product.getVariants()) {
                if (variant instanceof ConcertModel) {
                    ConcertSummaryData summary = concertConverter.convert((ConcertModel) variant);
                    concerts.add(summary);
                }
            }
        }
        return concerts;
    }

    @Required
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
