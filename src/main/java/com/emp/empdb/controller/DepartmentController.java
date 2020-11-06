package com.emp.empdb.controller;

import com.emp.empdb.domain.Department;
import com.emp.empdb.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {


    private DepartmentRepository departmentRepository;
    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @GetMapping("/department/name/{deptName}")
    public List<Department> getDepartmentByName(@PathVariable("deptName") String deptName){

        List<Department> depList
                = departmentRepository.findByDeptNameContaining(deptName);
        return depList;

    }
}
