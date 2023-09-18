package com.roman.portier.service.imp;

import com.roman.portier.repository.ArticleRepository;
import com.roman.portier.entity.Article;
import com.roman.portier.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public Article getArticle(int id) {
        return articleRepository.findById(id).get();
    }
}
