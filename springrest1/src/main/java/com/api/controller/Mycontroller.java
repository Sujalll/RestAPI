package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Course;
import com.api.services.CourseServices;


@RestController
public class Mycontroller {

	private static final String CourseId = null;
	@Autowired
	private CourseServices courseservice;
	
	@GetMapping("/Courses")
	public List<Course> courses(){
		return this.courseservice.getcourses();
	}
	
	@GetMapping("/Courses/{CourseId}")
	public Course getcourses(@PathVariable String CourseId) {
		return this.courseservice.getCourses(Long.parseLong(CourseId));
	}
	
	@PostMapping("/Courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseservice.addCourse(course);
		
	}
	
	@PutMapping("/Courses/{CourseId}")
	public Course putCourses( @RequestBody Course course,@PathVariable int id) {
		return this.courseservice.putCourse(course,id);
		
	}
	
	@DeleteMapping("/Courses/{courseId}")
	public int deleteCourse(@PathVariable long courseId) {
        boolean deleted = this.courseservice.deleteCourse(courseId);
        return deleted ? 0 : 1; // Return 0 for true (deleted successfully), 1 for false (not found or could not be deleted)
    }

}
