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

        for (int i = 14; i <= 15; i++) {
            TitleWithDescription titleDesc = titleWithDescriptionService.getTitleWithDescription(i);
            model.addAttribute("titleDesc" + i, titleDesc);
        }

        for (int i = 3; i <= 6; i++) {
            Article article = articleService.getArticle(i);
            model.addAttribute("article" + i, article);
        }

        TitleWithDescription titleDesc6 = titleWithDescriptionService.getTitleWithDescription(6);
        model.addAttribute("titleDesc6", titleDesc6);

        return "blog";

    }

}
