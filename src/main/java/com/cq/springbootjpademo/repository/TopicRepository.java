package com.cq.springbootjpademo.repository;

import com.cq.springbootjpademo.domin.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {
}
