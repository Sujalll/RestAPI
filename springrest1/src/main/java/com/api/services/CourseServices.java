package com.api.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.entities.Course;

public interface CourseServices {

	public List<Course> getcourses();
	public Course getCourses(long CourseId);
	Course getCourse(long courseId);
	public Course putCourse(Course course,int id);
	public Course addCourse(long CourseId );
	Course putCourse(Course course);
	Course addCourse(Course course);
	public boolean deleteCourse(long CourseId);
	Course deleteCourse(Course course);
	
	
}
