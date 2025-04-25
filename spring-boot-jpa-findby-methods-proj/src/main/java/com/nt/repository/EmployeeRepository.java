package com.nt.repository;

import com.nt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{


  public List<Employee> findByEmpSalaryBetween(Double startRange,Double endRange);

  public List<Employee> findByEmpSalaryLessThanEqual(Double empSal);

  public List<Employee> findByEmpNameLike(String startChar);


   public List<Employee>  findByEmpDesgOrderByEmpSalaryDesc(String designation);

   public List<Employee> findByEmpNameEndingWith(String endWith);

}
