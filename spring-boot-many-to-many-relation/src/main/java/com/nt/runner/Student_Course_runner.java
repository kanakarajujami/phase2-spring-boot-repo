package com.nt.runner;

import com.nt.entity.Course;
import com.nt.entity.Student;
import com.nt.repository.CoursesRepo;
import com.nt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student_Course_runner implements CommandLineRunner {

    @Autowired
    private StudentRepository stuRepo;

    @Autowired
    private CoursesRepo courseRepo;
    @Override
    public void run(String... args) throws Exception {

        Course course1=new Course();
        course1.setTitle("Biology");

        Course course2=new Course();
        course2.setTitle("Mathematics");

        //save courses
     /*   courseRepo.save(course1);
        courseRepo.save(course2);*/


        //find courses
        List<Course> listCourses=courseRepo.findAll();
        Student stu1=new Student();
        stu1.setName("manisha");


        listCourses.forEach(course->{
            course.getStudents().add(stu1);

        });
        stuRepo.save(stu1);



    }
}
