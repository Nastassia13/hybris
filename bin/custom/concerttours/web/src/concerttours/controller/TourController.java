package concerttours.controller;

import concerttours.facades.TourFacade;
import de.hybris.platform.catalog.CatalogVersionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@Controller
public class TourController {
    private static final String CATALOG_ID = "concertoursProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";

    @Resource
    private TourFacade tourFacade;
    @Resource
    private CatalogVersionService catalogVersionService;

    @GetMapping(value = "/tour/{code}")
    public String handleRequest(Model model, @PathVariable String code) {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        model.addAttribute("tour", tourFacade.getTourDetails(code));
        return "tour";
    }
}
