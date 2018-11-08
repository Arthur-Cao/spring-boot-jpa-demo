package com.cq.springbootjpademo.service;

import com.alibaba.fastjson.JSON;
import com.cq.springbootjpademo.domin.Article;
import com.cq.springbootjpademo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ArticleServiceImp implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    @Transactional
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article  updateArticle(Article article) {

        return articleRepository.save(article);
    }

    @Override
    @Transactional
    public Article findArticle(Long id) {
        Article article=articleRepository.getOne(id);
        System.out.println(JSON.toJSONString(article,true));
        return article;
    }

    @Override
    @Transactional
    public void delete(Long id) {
      articleRepository.deleteById(id);
    }
}
