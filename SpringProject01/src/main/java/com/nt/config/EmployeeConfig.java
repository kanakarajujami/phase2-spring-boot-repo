package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.nt.pojo.Employee;

@Configuration
public class EmployeeConfig {

	@Bean(name="emp1")
	public Employee employee1() {
		Employee emp=new Employee();
		emp.setName("Alice");
		emp.setSalary(20000);
		return emp;
	}
	@Primary
	@Bean("emp2")
	public Employee employee2() {
		Employee emp=new Employee();
		emp.setName("Ram");
		emp.setSalary(50000);
		return emp;
	}
	
}
