package com.roman.portier.controller;


import com.roman.portier.entity.*;
import com.roman.portier.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    private final TitleWithDescriptionService titleWithDescriptionService;
    private final SkillService skillService;
    private final WorkCardService workCardService;
    private final ArticleService articleService;
    private final FeedbackService feedbackService;

    public MainController(TitleWithDescriptionService titleWithDescriptionService, SkillService skillService, WorkCardService workCardService, ArticleService articleService, FeedbackService feedbackService) {
        this.titleWithDescriptionService = titleWithDescriptionService;
        this.skillService = skillService;
        this.workCardService = workCardService;
        this.articleService = articleService;
        this.feedbackService = feedbackService;
    }



    @RequestMapping("index")
    public String index(Model model) {

        TitleWithDescription titleDesc = titleWithDescriptionService
                .getTitleWithDescription(1);
        model.addAttribute("titleDesc", titleDesc);
        TitleWithDescription titleDesc2 = titleWithDescriptionService
                .getTitleWithDescription(2);
        model.addAttribute("titleDesc2", titleDesc2);

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
        Feedback feedback2 = feedbackService.getFeedback(2);
        Feedback feedback3 = feedbackService.getFeedback(3);
        model.addAttribute("feedback", feedback);

        return "index";
    }

    @GetMapping("portfolio")
    public String portfolio(Model model) {
        return "portfolio";
    }

}
