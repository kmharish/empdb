package com.emp.empdb.repositories;

import com.emp.empdb.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

   // List<Employee> findByFirstNameContainingAndGenderMale(String firstName);


}
