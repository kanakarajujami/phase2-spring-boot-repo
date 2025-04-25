package com.nt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name="student_many_to_many")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long stuId;

    public String name;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name="student_courses",
            joinColumns =@JoinColumn(name="student_id"),
            inverseJoinColumns =@JoinColumn(name="course_id")
    )
    public Set<Courses> courses=new HashSet<>();
}
