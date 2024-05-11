package com.api.services;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.entities.Course;

@Service
public class courseServiceimpl implements CourseServices {

	List<Course> list;
	private Object courses;
	private long courseId;
	private Course c;
	
	public courseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(121,"Sujal","Java"));
		
	}
	@Override
	public List<Course> getcourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c= null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course getCourses(long CourseId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	
	@Override
	public Course putCourse(Course course,int id) {
		 for (int i = 0; i < list.size(); i++) {
	            Course existingCourse = list.get(i);
	            if (existingCourse.getId() == id) {
	                list.set(i, course); // Update the existing course
	                return course;
	            }
	        }
		return null;
	}
	@Override
	public Course addCourse(long CourseId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteCourse(long courseId) {
        Iterator<Course> iterator = list.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == courseId) {
                iterator.remove(); // Remove the course from the list
                return true; // Course successfully deleted
            }
        }
        return false; // Course not found or could not be deleted
    }
	@Override
	public Course deleteCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Course putCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
