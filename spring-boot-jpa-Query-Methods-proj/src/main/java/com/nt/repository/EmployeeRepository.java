package com.nt.repository;

import com.nt.entity.Employee;
import com.nt.view.IView;
import com.nt.view.IView1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("select count(*) from Employee")
    public Integer  countEmployees();

    @Query("select max(empSalary) from Employee")
    public Double maxEmployeeSalary();
    @Query("select empId,empSalary from Employee")
    public List<Object[]> getEmployesBySalRange(Double startRange,Double endRange);

    @Query("update Employee set empSalary=empSalary+(empSalary*10/100) where empSalary>=:salary" )
    @Transactional
    @Modifying
    public Integer incrementEmpSalary(Double salary);

    @Query("delete from Employee where empSalary between :startRange and :endRange ")
    @Transactional
    @Modifying
    public Integer deleteEmployeeBySalRange(Double startRange,Double endRange);

    //public List<IView> findByEmpSalaryBetween(Double startRange,Double endRange);

    public <T extends IView> List<T> findByEmpSalaryBetween(Double startRange, Double endRange, Class<T> type);



}