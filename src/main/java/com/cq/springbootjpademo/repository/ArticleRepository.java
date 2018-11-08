package com.cq.springbootjpademo.repository;

import com.cq.springbootjpademo.domin.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article,Long> {

}
