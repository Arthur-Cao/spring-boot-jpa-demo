package com.cq.springbootjpademo.service;

import com.cq.springbootjpademo.domin.Author;
import com.cq.springbootjpademo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author findAuthor(Long id){
        return  authorRepository.findAuthorById(id);
    }

    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author updateAuthor(Author author){
        return authorRepository.save(author);
    }

    public void delete(Long id){
        authorRepository.deleteById(id);
    }

}
