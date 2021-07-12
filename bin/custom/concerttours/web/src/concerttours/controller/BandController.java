package concerttours.controller;

import concerttours.facades.BandFacade;
import de.hybris.platform.catalog.CatalogVersionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/bands")
public class BandController {
    private static final String CATALOG_ID = "concertoursProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";

    @Resource
    private BandFacade bandFacade;
    @Resource
    private CatalogVersionService catalogVersionService;

    @GetMapping
    public String handleRequest(Model model) {
        model.addAttribute("bands", bandFacade.getBands());
        return "bandList";
    }

    @GetMapping(value = "/{code}")
    public String handleRequest(Model model, @PathVariable String code) {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        model.addAttribute("band", bandFacade.getBand(code));
        return "band";
    }
}
