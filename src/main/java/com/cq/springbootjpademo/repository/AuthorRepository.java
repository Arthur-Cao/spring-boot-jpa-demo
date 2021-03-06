package com.cq.springbootjpademo.repository;

import com.cq.springbootjpademo.domin.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author,Long> {

    @Override
    Page<Author> findAll(Pageable pageable);

    Author findAuthorById(Long id);


}
