package com.nt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer courseId;
    private String title;
    @ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
    private Set<Student> students;
}
