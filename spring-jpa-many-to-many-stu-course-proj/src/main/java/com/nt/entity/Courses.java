package com.nt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="courses_many_to_many")
@Setter
@Getter
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long course_id;

    public String title;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    public Set<Student> students= new HashSet<>();
}
