package com.nt.repository;

import com.nt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositroy extends JpaRepository<Student,Long> {
}
