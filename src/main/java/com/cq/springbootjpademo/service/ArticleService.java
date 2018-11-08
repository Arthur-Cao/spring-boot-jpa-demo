package com.cq.springbootjpademo.service;


import com.cq.springbootjpademo.domin.Article;

public interface ArticleService {

  Article saveArticle(Article article);

  Article updateArticle(Article article);

  Article findArticle(Long id);

  void  delete(Long id);
}
