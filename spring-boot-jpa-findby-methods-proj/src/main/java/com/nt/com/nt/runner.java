package com.nt.com.nt;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class runner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository empRepo;
    @Override
    public void run(String... args) throws Exception {

        //save employees
/*
        empRepo.saveAll(List.of(new Employee("ram","developer",45000.0),
                     new Employee("mani","tester",55000.0),
                    new Employee("seetha","frontend",55000.0),
                new Employee("varma","cloud enginner",75000.0),
                new Employee("sridhar","supporter",55000.0),
                new Employee("manisha","developer",46000.0),
               new Employee("ganesh","supporter",65000.0),
                new Employee("srinu","devops",75000.0),
                new Employee("varma","frontend",35000.0),
                new Employee("sridhar","devops",45000.0),
                new Employee("hari","devloper",75000.0),
                new Employee("dinesh","front-end",65000.0)
        ));*/


        //get employees by salary range
/*

       List<Employee> salRangeEmployees=empRepo.findByEmpSalaryBetween(35000.0,65000.0);
       salRangeEmployees.forEach(System.out::println);
*/


        //get employees salary less than equal 55000.0

        System.out.println("Salary less than  equal 55000.0 ");
        List<Employee> salLessEmps=empRepo.findByEmpSalaryLessThanEqual(55000.0);
        salLessEmps.forEach(System.out::println);

        //find employees name contains
        System.out.println("get Employes name contains m character ");
        List<Employee> listEmps=empRepo.findByEmpNameLike("m%");
        listEmps.forEach(System.out::println);


        //find employees by designation order by salary desc
        System.out.println("get employees by designation order by salary");
        List<Employee> listEmps2=empRepo.findByEmpDesgOrderByEmpSalaryDesc("developer");

        listEmps2.forEach(System.out::println);


        //find employees ends with "a" character
        System.out.println("find employees ends with character ===a===");
        List<Employee> listEmps3=empRepo.findByEmpNameEndingWith("a");

        listEmps3.forEach(System.out::println);
    }
}

