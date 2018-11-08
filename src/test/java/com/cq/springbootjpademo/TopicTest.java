package com.cq.springbootjpademo;

import com.cq.springbootjpademo.domin.Topic;
import com.cq.springbootjpademo.repository.TopicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicService topicService;

    @Test
    public void saveTopic(){
        Topic topic = new Topic();
        topic.setName("Art");
        topicService.save(topic);
    }

    @Test
    public  void updateTopic(){
        Topic topic = topicService.find(11l);
        topic.setName("艺术");
        topicService.update(topic);
    }
}
