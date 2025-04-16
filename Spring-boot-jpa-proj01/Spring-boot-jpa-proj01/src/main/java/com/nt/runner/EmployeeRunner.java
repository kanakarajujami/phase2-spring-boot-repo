package com.nt.runner;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private IEmployeeRepo repository;
    @Override
    public void run(String... args) throws Exception {

         //save employees in database
        repository.save(new Employee("manikankta","developer",4500.0));
        repository.save(new Employee("srinu","tester",7500.0));
        repository.save(new Employee("manohar","devops",65000.0));
        repository.save(new Employee("stalinn","cluod",55000.0));
        repository.save(new Employee("ravi","front-end",85000.0));
        repository.save(new Employee("manoj","db developer",35000.0));
        repository.save(new Employee("ganesh","architect",78000.0));

          //find records
           List listEmployees=(List)repository.findAll();
           listEmployees.forEach(System.out::println);

           //find by id

        System.out.println("===========find the employee by id==========");
        Optional<Employee> opt =repository.findById(90);
        if(opt.isPresent()){
           System.out.println(opt.get());
        }else{
            throw new IllegalArgumentException("Employee id not found");
        }


        System.out.println("count of employees:"+repository.count());

        System.out.println("delete all employees");
        repository.deleteAll();



       //delete employees by ids

        System.out.println("delete employees by ids");
       repository.deleteAllById(List.of(1,2,3));

        //select employees by ids

        System.out.println("find employees by ids");
        repository.findAllById(List.of(4,5,6)).forEach(System.out::println);

        //delete employee

        System.out.println("delete single employee");
        Employee emp=new Employee(10,"ganesh","architect",78000.0);
        repository.delete(emp);

        System.out.println("employee checking in database");
        boolean b = repository.existsById(4);

        if(b){
            System.out.println("employee is present in database");
        }else{
            System.out.println("employee is not present in database");
        }


    }
}
