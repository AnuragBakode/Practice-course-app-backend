package com.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.entities.Courses;
import com.springrest.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	// List<Courses> list;
	@Autowired
	private CourseRepository courseRepo;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Courses(1 ,  "Spring Boot" , "RestApi"));
//		list.add(new Courses(2 ,  "React" , "typeScript"));
	}

	@Override
	public List<Courses> getCourses() {
		return courseRepo.findAll();
//		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Courses getCourse(long courseId) {
//		Courses c = null;
//		for(Courses course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return courseRepo.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
//		list.add(course);
		courseRepo.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseRepo.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long CourseId) {
//		list = this.list.stream().filter(e -> e.getId() != CourseId).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Courses course = courseRepo.getById(CourseId);
		courseRepo.delete(course);
	}
	
}
