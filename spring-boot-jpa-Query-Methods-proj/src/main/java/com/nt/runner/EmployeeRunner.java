package com.nt.runner;


import com.nt.repository.EmployeeRepository;
import com.nt.view.IView;
import com.nt.view.IView1;
import com.nt.view.IView2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //find count of employees
        Integer empCount=repository.countEmployees();
        System.out.println("employees count:"+empCount);


        //find max salary of employee


        Double maxSal=repository.maxEmployeeSalary();
        System.out.println("employee max salary:"+maxSal);

        //find employees by salary range
/*
         List<Object[]> listEmps =repository.getEmployesBySalRange(35000.0,50000.0);
         listEmps.forEach(obj->{
             for(Object empEle: obj){
                 System.out.println(empEle);
             }
         });*/

/*


        Integer incrementEmps =repository.incrementEmpSalary(55000.0);
        System.out.println("10 percent increment employees count:"+incrementEmps);
*/
/*

        Integer deleteEmps=repository.deleteEmployeeBySalRange(35000.0,45000.0);
        System.out.println("deleted employees:"+deleteEmps);*/


        //static projections getting Employee data

      /*  System.out.println("=======static projections=====");
        List<IView> listEmps=repository.findByEmpSalaryBetween(35000.0,65000.0);

        listEmps.forEach(emp->{
            System.out.println(emp.getEmpName()+" "+emp.getEmpSalary());
        });
*/
        System.out.println("=======dynamic projections========");



        List<IView1> listEmps4 = repository.findByEmpSalaryBetween(35000.0,70000.0,IView1.class);

        listEmps4.forEach(emp->{
            System.out.println(emp.getEmpId()+" "+emp.getEmpName());
        });


        System.out.println("=============================");
         List<IView2> listEmps5=repository.findByEmpSalaryBetween(35000.0,65000.0,IView2.class);
         listEmps5.forEach(emp->{
             System.out.println(emp.getEmpId()+" "+emp.getEmpDesg()+" "+emp.getEmpSalary());
         });


    }


}
