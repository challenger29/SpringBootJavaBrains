package com.javabrains.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javabrains.model.Topic;
@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java" , "Schildt" ,""),
			new Topic("javascript" , "JAVASCRIPT EBOOK" , "small short desc")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(Topic topic, String id) {
		for(int i = 0 ; i < topics.size() ; i++){
			if(topics.get(i).getId().equals(id)){
				topics.set(i , topic);
				return;
			}
		}
	}
	public void removeTopic(String id) {
		for(int i = 0 ; i < topics.size() ; i++){
			if(topics.get(i).getId().equals(id)){
				topics.remove(i);
				return;
			}
		}
	}
	
}
