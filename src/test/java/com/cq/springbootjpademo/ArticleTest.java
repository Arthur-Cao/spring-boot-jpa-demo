package com.cq.springbootjpademo;

import com.alibaba.fastjson.JSON;
import com.cq.springbootjpademo.domin.Article;
import com.cq.springbootjpademo.domin.Author;
import com.cq.springbootjpademo.domin.Comment;
import com.cq.springbootjpademo.domin.Wallet;
import com.cq.springbootjpademo.repository.ArticleRepository;
import com.cq.springbootjpademo.repository.AuthorRepository;
import com.cq.springbootjpademo.service.ArticleService;
import com.cq.springbootjpademo.service.ArticleServiceImp;
import com.cq.springbootjpademo.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleTest {

   @Autowired
    private ArticleService articleService;

   @Autowired
   private ArticleRepository articleRepository;

   @Test
    public  void  saveArticle(){
      Article article= new Article();
       article.setTitle("Computer");
       article.setContent("about programming");
       List<Comment> comments=new ArrayList<>();
       Comment comment1=new Comment();
       comment1.setContent("nice");
       comment1.setArticle(article);
       Comment comment2=new Comment();
       comment2.setContent("Very nice");
       comment2.setArticle(article);
       comments.add(comment1);
       comments.add(comment2);
       article.setComments(comments);
       articleService.saveArticle(article);
   }

   @Test
   @Transactional
   public  void  updateArticle(){
      Article article = articleService.findArticle(7L);
      article.setContent("about future");
      articleService.saveArticle(article);
   }


    @Test
   // @Transactional
    public  void  findArticle(){
        Article article = articleService.findArticle(7l);
//        System.out.println(JSON.toJSONString(article,true));

    }

    @Test

    public  void  deleteArticle(){

        articleService.delete(4l);

    }
}
