package com.roman.portier.controller;

import com.roman.portier.entity.Experience;
import com.roman.portier.entity.Quality;
import com.roman.portier.entity.TitleWithDescription;
import com.roman.portier.service.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
public class AboutPageController {

    private final TitleWithDescriptionService titleWithDescriptionService;

    private final QualityService qualityService;

    private final ExperienceService experienceService;

    public AboutPageController(TitleWithDescriptionService titleWithDescriptionService, QualityService qualityService, ExperienceService experienceService) {
        this.titleWithDescriptionService = titleWithDescriptionService;
        this.qualityService = qualityService;
        this.experienceService = experienceService;
    }

    @RequestMapping("/about.html")
    public String aboutMe(Model model) {

        TitleWithDescription titleDesc8 = titleWithDescriptionService.getTitleWithDescription(8);
        model.addAttribute("titleDesc8", titleDesc8);
        TitleWithDescription titleDesc9 = titleWithDescriptionService.getTitleWithDescription(9);
        model.addAttribute("titleDesc9", titleDesc9);

        Quality  quality = qualityService.getQuality(1);
        Quality  quality2 = qualityService.getQuality(2);
        Quality  quality3 = qualityService.getQuality(3);
        Quality  quality4 = qualityService.getQuality(4);
        Quality  quality5 = qualityService.getQuality(5);
        Quality  quality6 = qualityService.getQuality(6);

        model.addAttribute("quality", quality);
        model.addAttribute("quality2", quality2);
        model.addAttribute("quality3", quality3);
        model.addAttribute("quality4", quality4);
        model.addAttribute("quality5", quality5);
        model.addAttribute("quality6", quality6);

        TitleWithDescription titleDesc10 = titleWithDescriptionService.getTitleWithDescription(9);
        model.addAttribute("titleDesc10", titleDesc10);

        TitleWithDescription titleDesc11 = titleWithDescriptionService.getTitleWithDescription(9);
        model.addAttribute("titleDesc11", titleDesc11);

        TitleWithDescription titleDesc12 = titleWithDescriptionService.getTitleWithDescription(9);
        model.addAttribute("titleDesc12", titleDesc12);

        TitleWithDescription titleDesc13 = titleWithDescriptionService.getTitleWithDescription(9);
        model.addAttribute("titleDesc13", titleDesc13);

        Experience experience = experienceService.getExperience(1);
        Experience experience2 = experienceService.getExperience(2);
        Experience experience3 = experienceService.getExperience(3);
        Experience experience4 = experienceService.getExperience(4);
        Experience experience5 = experienceService.getExperience(5);

        model.addAttribute("experience", experience);
        model.addAttribute("experience2", experience2);
        model.addAttribute("experience3", experience3);
        model.addAttribute("experience4", experience4);
        model.addAttribute("experience5", experience5);


        TitleWithDescription titleDesc6 = titleWithDescriptionService.getTitleWithDescription(6);
        model.addAttribute("titleDesc6", titleDesc6);

        return "about";
    }

}
