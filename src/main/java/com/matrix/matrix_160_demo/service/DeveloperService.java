package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.entity.Developer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeveloperService {
    Developer add (Developer developer);
    Developer findById(Integer id);
    Developer update(Developer developer);
    void delete(Integer id);
    List<Developer> findAll();
}
