package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employee,Integer> {
}
