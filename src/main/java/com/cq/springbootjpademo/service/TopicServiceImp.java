package com.cq.springbootjpademo.service;

import com.cq.springbootjpademo.domin.Article;
import com.cq.springbootjpademo.domin.Topic;
import com.cq.springbootjpademo.repository.ArticleRepository;
import com.cq.springbootjpademo.repository.TopicRepository;
import com.cq.springbootjpademo.repository.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class TopicServiceImp implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    @Transactional
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }
    @Transactional
    @Override
    public Topic update(Topic topic) {
        return topicRepository.save(topic);
    }
    @Transactional
    @Override
    public Topic find(Long id) {
        return topicRepository.getOne(id);
    }
    @Transactional
    @Override
    public Topic include(Long topicId, Long articleId) {
        Topic topic= topicRepository.getOne(topicId);
        Article article= articleRepository.getOne(articleId);
        topic.getArticles().add(article);
        return topicRepository.save(topic);
    }

    @Override
    public Topic exclude(Long topicId, Long articleId) {
        Topic topic= topicRepository.getOne(topicId);
        Article article= articleRepository.getOne(articleId);
        topic.getArticles().remove(article);
        return topicRepository.save(topic);
    }

    @Override
    public void delete(Long id) {
           topicRepository.deleteById(id);
    }
}
