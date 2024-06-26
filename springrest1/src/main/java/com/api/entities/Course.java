package com.api.entities;

public class Course {

	private long id;
	private String name;
	private String course;
	public Course(long id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
}
