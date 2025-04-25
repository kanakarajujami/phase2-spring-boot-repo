package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;

@Entity
@Data
@RequiredArgsConstructor
//@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private final String empName;
    private final String empDesg;
    private final Double empSalary;



}
