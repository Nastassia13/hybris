package concerttours.facades.impl;

import concerttours.data.ConcertData;
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
    private Converter<ConcertModel, ConcertData> concertConverter;
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
        tourData.setConcerts(findConcertData(product));
        return tourData;
    }

    private List<ConcertData> findConcertData(ProductModel product) {
        List<ConcertData> concerts = new ArrayList<>();
        if (product.getVariants() != null) {
            for (VariantProductModel variant : product.getVariants()) {
                if (variant instanceof ConcertModel) {
                    ConcertData concertData = concertConverter.convert((ConcertModel) variant);
                    concerts.add(concertData);
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
