package com.hcl.Employee_Management_System.Repository;

import com.hcl.Employee_Management_System.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
   // Employee getByName(String name);

    Employee findByName(String name);
}
