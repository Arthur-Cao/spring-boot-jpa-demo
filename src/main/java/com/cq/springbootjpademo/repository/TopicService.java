package com.cq.springbootjpademo.repository;

import com.cq.springbootjpademo.domin.Topic;

public interface TopicService {

    Topic save(Topic topic);

    Topic update(Topic topic);

    Topic find(Long id);

    Topic include(Long topicId,Long articleId);

    Topic exclude(Long topicId,Long articleId);

    void delete(Long id);
}
