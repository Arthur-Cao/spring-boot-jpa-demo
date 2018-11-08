package com.cq.springbootjpademo;

import com.alibaba.fastjson.JSON;
import com.cq.springbootjpademo.domin.Author;
import com.cq.springbootjpademo.domin.Wallet;
import com.cq.springbootjpademo.repository.AuthorRepository;
import com.cq.springbootjpademo.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorService authorService;

    @Test
    public void saveAuthorTest(){
        Author author = new Author();
        author.setNickName("Hardon");
        author.setPhone("8888");
        author.setSignDate(new Date());
        author.setWallet(new Wallet(999.88));
        authorRepository.save(author);
    }


    @Test
    public void updateAuthor(){

        int id = 4;
        Author author = authorRepository.findAuthorById(Long.valueOf(id));
        Wallet wallet = author.getWallet();
        wallet.setBalence(111);
        authorService.updateAuthor(author);
    }


    @Test
    public void findAuthor(){
        Author author = authorService.findAuthor(4L);
        System.out.println(JSON.toJSONString(author,true));
    }

    @Test
    public void deleteAuthor(){
         authorService.delete(4l);
    }
//    @Test
//    public void findByPage(){
//        Sort sort = new Sort(Sort.Direction.DESC,"id");
//
//        org.springframework.data.domain.Pageable pageable =  new PageRequest(1,3,sort);
//
//        Page<Author> ls= authorService.findAll(pageable);
//        System.out.println(JSON.toJSONString(ls,true));
//
//    }
}
