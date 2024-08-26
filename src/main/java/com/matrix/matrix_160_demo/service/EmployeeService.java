package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Optional<Employee> findById(Integer id);

    Employee add(Employee employee);

    void deleteById(Integer id);

    Employee update(Employee employee);

    List<Employee> getAll();

}
