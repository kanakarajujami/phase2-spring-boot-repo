package com.nt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer stuId;

    private String name;

    @ManyToMany()
    @JoinTable(
            name="student_course",
            joinColumns = @JoinColumn(name="stu-id"),
            inverseJoinColumns = @JoinColumn(name="course_id")
    )
    private Set<Course> courses;
}
