package concerttours.controller;

import concerttours.facades.NewsFacade;
import de.hybris.platform.catalog.CatalogVersionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/news")
public class NewsController {
    private static final String CATALOG_ID = "concertoursProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";

    @Resource
    private NewsFacade newsFacade;
    @Resource
    private CatalogVersionService catalogVersionService;

    @GetMapping
    public String handleRequest(Model model) {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        model.addAttribute("news", newsFacade.getNews());
        return "news";
    }
}
