package com.emp.empdb.controller;


import com.emp.empdb.domain.Employee;
import com.emp.empdb.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/employee/{empId}")
    public Employee getEmployee(@PathVariable("empId") Integer empId){

        Employee e= employeeRepository.findById(empId).get();
        return e;

    }

    @GetMapping("/employee/name/{firstName}")
    public List<Employee> getEmployeesByName(@PathVariable("firstName") String firstName){
       // List<Employee> employeeList
         //       = employeeRepository.findByFirstNameContainingAndGenderMale(firstName);

        return null;//employeeList;


    }

    @GetMapping("/femployee")
    public List<Employee> getFEmployeesByName(){
        // List<Employee> employeeList
          //    = employeeRepository.findByGenderFemale();

        return null;//employeeList;//employeeList;

    }
}
