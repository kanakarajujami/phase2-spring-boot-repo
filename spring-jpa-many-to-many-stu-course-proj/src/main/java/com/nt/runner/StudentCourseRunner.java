package com.nt.runner;

import com.nt.entity.Courses;
import com.nt.entity.Student;
import com.nt.repository.CourseRepository;
import com.nt.repository.StudentRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;


@Component
public class StudentCourseRunner implements CommandLineRunner {
    @Autowired
    private StudentRepositroy studentRepo;

    @Autowired
    private CourseRepository courseRepo;

    @Override
    public void run(String... args) throws Exception {


        //register student with courses

        Student student = new Student();
        student.setName("Ganesh");

        Courses course1 = new Courses();
        course1.setTitle("DJango");


        Courses course2 = new Courses();
        course2.setTitle("PostGresql");

        //add courses to student
        student.getCourses().add(course1);
        student.getCourses().add(course2);

        //add student to courses

        course1.getStudents().add(student);
        course2.getStudents().add(student);
        Long stuId = studentRepo.save(student).getStuId();

        System.out.println("student registered with courses with student id:" + stuId);


        //delete the student

        Optional<Student> opt = studentRepo.findById(1L);
        if(opt.isPresent()){
            Student student1=opt.get();
            student1.getCourses().clear();
            studentRepo.delete(student1);
            System.out.println("student is deleted...");
        }else{
            System.out.println("id not found");
        }

        //delete the course from the student

        Optional<Student> opt = studentRepo.findById(4L);

        if (opt.isPresent()) {
            Student student3 = opt.get();
          Set<Courses> courses = student3.getCourses();
            courses.clear();
            student3.getCourses().clear();
            studentRepo.save(student3);
            System.out.println("student courses deleted");


        }
        else{
            System.out.println("student id not found to delete..");
        }
    }
}