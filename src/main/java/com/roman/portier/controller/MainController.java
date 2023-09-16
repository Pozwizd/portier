package com.roman.portier.controller;


import com.roman.portier.entity.*;
import com.roman.portier.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private TitleWithDescriptionService titleWithDescriptionService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private WorkCardService workCardService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private FeedbackService feedbackService;


    @RequestMapping("/")
    public String index(Model model) {

        TitleWithDescription titleDesc = (TitleWithDescription) titleWithDescriptionService.getTitleWithDescription(1);
        model.addAttribute("titleDesc", titleDesc);

        Skill skill = skillService.getSkill(1);
        Skill skill2 = skillService.getSkill(2);
        Skill skill3 = skillService.getSkill(3);
        model.addAttribute("skill", skill);
        model.addAttribute("skill2", skill2);
        model.addAttribute("skill3", skill3);

        WorkCard workCard = workCardService.getWorkCard(1);
        WorkCard workCard2 = workCardService.getWorkCard(2);
        WorkCard workCard3 = workCardService.getWorkCard(3);
        model.addAttribute("workCard", workCard);
        model.addAttribute("workCard2", workCard2);
        model.addAttribute("workCard3", workCard3);

        Article article = articleService.getArticle(1);
        model.addAttribute("article", article);

        Feedback feedback = feedbackService.getFeedback(1);
        model.addAttribute("feedback", feedback);

        return "index";
    }

    @RequestMapping("/portfolio")
    public String portfolio(Model model) {
        return "portfolio";
    }

}
