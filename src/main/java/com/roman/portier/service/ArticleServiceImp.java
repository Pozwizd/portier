package com.roman.portier.service;

import com.roman.portier.dao.ArticleRepository;
import com.roman.portier.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public Article getArticle(int id) {
        return articleRepository.findById(id).get();
    }
}
