package com.emp.empdb.domain;

import com.emp.empdb.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        System.out.println("setUp Method");

    }

    @Test
    void test() {
        System.out.println("Emp from DB:\n");

       assertTrue(employeeRepository.findById(10038).isPresent());
        System.out.println();
    }
}