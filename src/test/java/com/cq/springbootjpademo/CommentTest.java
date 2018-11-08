package com.cq.springbootjpademo;

import com.cq.springbootjpademo.domin.Article;
import com.cq.springbootjpademo.domin.Comment;
import com.cq.springbootjpademo.service.ArticleService;
import com.cq.springbootjpademo.service.CommentService;
import com.cq.springbootjpademo.service.CommentServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentTest {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ArticleService articleService;

    @Test
    public void saveComment(){
        Article article = articleService.findArticle(7L);
        Comment comment = new Comment();
        comment.setContent("hello, world");
        comment.setArticle(article);
        commentService.create(comment);
    }

    @Test
    public  void deleteComment(){
        commentService.delete(8l);
    }

}
