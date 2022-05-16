package com.kt.edu.firstproject.service;

import com.kt.edu.firstproject.entity.Article;
import com.kt.edu.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 해당 클래스를 서비스로 인식하여 스프링부트에 객체를 생성(등록)
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> index() {
        return articleRepository.findAll();
    }

    public Article findById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
}