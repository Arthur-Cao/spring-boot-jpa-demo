package com.cq.springbootjpademo.web;

import com.cq.springbootjpademo.domin.Article;
import com.cq.springbootjpademo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/get")
    public  void  updateArticle(){
        Article article = articleService.findArticle(7L);
        article.setContent("about future");
        articleService.saveArticle(article);
    }
}
