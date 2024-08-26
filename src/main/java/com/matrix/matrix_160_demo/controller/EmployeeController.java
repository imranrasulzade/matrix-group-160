package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.entity.Employee;
import com.matrix.matrix_160_demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @GetMapping("{id}")
    public Optional<Employee> findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    ;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Employee add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){
        employeeService.deleteById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
    //stash
}
