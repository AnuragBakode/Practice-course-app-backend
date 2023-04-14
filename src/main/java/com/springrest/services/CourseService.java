package com.springrest.services;

import java.util.List;

import com.springrest.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourse(long CourseId);
}
