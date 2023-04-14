package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Courses; 

public interface CourseRepository extends JpaRepository<Courses, Long>{

}
