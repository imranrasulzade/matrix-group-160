package com.matrix.matrix_160_demo.service.impl;


import com.matrix.matrix_160_demo.entity.Employee;
import com.matrix.matrix_160_demo.repositories.EmployeRepository;
import com.matrix.matrix_160_demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeRepository employeRepository;
    @Override
    public Optional<Employee> findById(Integer id) {
        return employeRepository.findById(id);
    }

    @Override
    public Employee add(Employee employee) {
        return employeRepository.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employee update(Employee employee) {
        return employeRepository.save(employee);
    }
}
