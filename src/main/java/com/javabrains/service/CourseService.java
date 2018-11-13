package com.javabrains.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabrains.model.Course;
import com.javabrains.repository.CourseRepository;
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String id){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;
	}
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}
	public void removeCourse(String id) {
		courseRepository.delete(id);
	}
	
}
