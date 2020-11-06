package com.emp.empdb.repositories;

import com.emp.empdb.domain.Department;
import com.emp.empdb.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {

    List<Department> findByDeptNameContaining(String deptName);

}
