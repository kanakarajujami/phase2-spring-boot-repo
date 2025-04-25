package com.nt.repository;

import com.nt.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Course,Integer> {
}
