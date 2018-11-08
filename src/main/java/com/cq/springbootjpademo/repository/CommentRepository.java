package com.cq.springbootjpademo.repository;

import com.cq.springbootjpademo.domin.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
