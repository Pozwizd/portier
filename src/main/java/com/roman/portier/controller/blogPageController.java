package com.roman.portier.controller;

import com.roman.portier.entity.Article;
import com.roman.portier.entity.TitleWithDescription;
import com.roman.portier.service.ArticleService;
import com.roman.portier.service.TitleWithDescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class blogPageController {

    private final TitleWithDescriptionService titleWithDescriptionService;

    private final ArticleService articleService;


    public blogPageController(TitleWithDescriptionService titleWithDescriptionService, ArticleService articleService) {
        this.titleWithDescriptionService = titleWithDescriptionService;
        this.articleService = articleService;
    }

    @RequestMapping("/blog.html")
    public String blog(Model model) {

        TitleWithDescription titleDesc14 = titleWithDescriptionService.getTitleWithDescription(14);
        model.addAttribute("titleDesc14", titleDesc14);

        TitleWithDescription titleDesc15 = titleWithDescriptionService.getTitleWithDescription(15);
        model.addAttribute("titleDesc15", titleDesc15);

        Article article3 = articleService.getArticle(3);
        Article article4 = articleService.getArticle(4);
        Article article5 = articleService.getArticle(5);
        Article article6 = articleService.getArticle(6);

        model.addAttribute("article3", article3);
        model.addAttribute("article4", article4);
        model.addAttribute("article5", article5);
        model.addAttribute("article6", article6);


        TitleWithDescription titleDesc6 = titleWithDescriptionService.getTitleWithDescription(6);
        model.addAttribute("titleDesc6", titleDesc6);

        return "blog";

    }

}
