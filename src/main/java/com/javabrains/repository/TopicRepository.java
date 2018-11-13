package com.javabrains.repository;

import org.springframework.data.repository.CrudRepository;

import com.javabrains.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
