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
	
}
