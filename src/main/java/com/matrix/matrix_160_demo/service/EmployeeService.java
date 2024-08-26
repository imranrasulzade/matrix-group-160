package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.entity.Employee;
import com.matrix.matrix_160_demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmployeeService {
    Optional<Employee> findById(Integer id);

    Employee add(Employee employee);

    void deleteById(Integer id);

    Employee update(Employee employee);

}
