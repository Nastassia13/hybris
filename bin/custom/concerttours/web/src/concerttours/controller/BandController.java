package concerttours.controller;

import concerttours.service.BandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@Controller
public class BandController {
    @Resource
    private BandService bandService;

    @GetMapping(value = "/bands")
    public String handleRequest(Model model) throws Exception {
        model.addAttribute("bands", bandService.findBands());
        return "bandList";
    }

    @GetMapping(value = "/band/{code}")
    public String handleRequest(Model model, @PathVariable String code) throws Exception {
        model.addAttribute("band", bandService.findBandForCode(code));
        return "band";
    }
}
