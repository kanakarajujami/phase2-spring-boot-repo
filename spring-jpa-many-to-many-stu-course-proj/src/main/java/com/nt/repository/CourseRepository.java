package com.nt.repository;

import com.nt.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses,Long> {
}
