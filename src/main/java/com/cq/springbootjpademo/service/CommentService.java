package com.cq.springbootjpademo.service;

import com.cq.springbootjpademo.domin.Comment;
import com.cq.springbootjpademo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface CommentService {

    Comment find(Long id);

    Comment create(Comment comment);

    Comment update(Comment comment);

    void  delete(Long id);

}
