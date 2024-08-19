package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
