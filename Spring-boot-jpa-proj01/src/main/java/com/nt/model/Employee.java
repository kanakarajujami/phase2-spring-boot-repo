package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="EMPLOYEE")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Employee {
   @Id
   @GeneratedValue
   Integer empId;
   final String empName;
   final String empDesg;
   final Double empSal;



/*    public Employee(String empDesg, String empName, Double empSal) {
        this.empDesg = empDesg;
        this.empName = empName;
        this.empSal = empSal;
    }



    public String getEmpDesg() {
        return empDesg;
    }

    public void setEmpDesg(String empDesg) {
        this.empDesg = empDesg;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }*/
}
