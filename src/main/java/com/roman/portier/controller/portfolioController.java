package com.roman.portier.controller;


import com.roman.portier.entity.TitleWithDescription;
import com.roman.portier.entity.WorkCard;
import com.roman.portier.service.TitleWithDescriptionService;
import com.roman.portier.service.WorkCardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class portfolioController {


    private final TitleWithDescriptionService titleWithDescriptionService;


    private final WorkCardService workCardService;

    public portfolioController(TitleWithDescriptionService titleWithDescriptionService, WorkCardService workCardService) {
        this.titleWithDescriptionService = titleWithDescriptionService;
        this.workCardService = workCardService;
    }

    @RequestMapping("/portfolio.html")
    public String portfolio(Model model) {

        TitleWithDescription titleDesc7 = titleWithDescriptionService.getTitleWithDescription(7);
        model.addAttribute("titleDesc7", titleDesc7);

        WorkCard workCard = workCardService.getWorkCard(1);
        WorkCard workCard1 = workCardService.getWorkCard(2);
        WorkCard workCard2 = workCardService.getWorkCard(3);

        model.addAttribute("workCard", workCard);
        model.addAttribute("workCard1", workCard1);
        model.addAttribute("workCard2", workCard2);

        TitleWithDescription titleDesc6 = titleWithDescriptionService.getTitleWithDescription(6);
        model.addAttribute("titleDesc6", titleDesc6);

        return "portfolio";
    }

}
