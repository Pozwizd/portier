package com.roman.portier.controller;


import com.roman.portier.entity.*;
import com.roman.portier.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexPageController {

    private final TitleWithDescriptionService titleWithDescriptionService;

    private final SkillService skillService;

    private final WorkCardService workCardService;

    private final ArticleService articleService;

    private final FeedbackService feedbackService;

    public indexPageController(TitleWithDescriptionService titleWithDescriptionService, SkillService skillService, WorkCardService workCardService, ArticleService articleService, FeedbackService feedbackService) {
        this.titleWithDescriptionService = titleWithDescriptionService;
        this.skillService = skillService;
        this.workCardService = workCardService;
        this.articleService = articleService;
        this.feedbackService = feedbackService;
    }


    @RequestMapping("/")
    public String index(Model model) {

        TitleWithDescription titleDesc = titleWithDescriptionService.getTitleWithDescription(1);
        model.addAttribute("titleDesc", titleDesc);

        Skill skill = skillService.getSkill(1);
        Skill skill2 = skillService.getSkill(2);
        Skill skill3 = skillService.getSkill(3);
        model.addAttribute("skill", skill);
        model.addAttribute("skill2", skill2);
        model.addAttribute("skill3", skill3);

        WorkCard workCard = workCardService.getWorkCard(1);
        WorkCard workCard1 = workCardService.getWorkCard(2);
        WorkCard workCard2 = workCardService.getWorkCard(3);

        model.addAttribute("workCard", workCard);
        model.addAttribute("workCard1", workCard1);
        model.addAttribute("workCard2", workCard2);

        Article article = articleService.getArticle(1);
        model.addAttribute("article", article);

        Article article2 = articleService.getArticle(2);
        model.addAttribute("article2", article2);

        Feedback feedback = feedbackService.getFeedback(1);
        Feedback feedback2 = feedbackService.getFeedback(2);
        Feedback feedback3 = feedbackService.getFeedback(3);

        model.addAttribute("feedback", feedback);
        model.addAttribute("feedback2", feedback2);
        model.addAttribute("feedback3", feedback3);

        for (int i = 2; i <= 6; i++) {
            model.addAttribute("titleDesc" + i, titleWithDescriptionService.getTitleWithDescription(i));
        }

        return "index";
    }

    @RequestMapping("/index.html")
    public String mainPage(Model model) {
        return "redirect:/";
    }
}
