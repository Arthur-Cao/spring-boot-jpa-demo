package com.cq.springbootjpademo.service;

import com.cq.springbootjpademo.domin.Comment;
import com.cq.springbootjpademo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp implements CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Override
    public Comment find(Long id) {
        return commentRepository.getOne(id);
    }

    @Override
    public Comment create(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment update(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void delete(Long id) {
        commentRepository.deleteById(id);

    }
}
