package com.nt.repository;

import com.nt.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee,Integer> {
}
