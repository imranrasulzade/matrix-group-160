package com.matrix.matrix_160_demo.service.impl;

import com.matrix.matrix_160_demo.entity.Developer;
import com.matrix.matrix_160_demo.repositories.DeveloperRepository;
import com.matrix.matrix_160_demo.service.DeveloperService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data

public class DeveloperServiceImpl  implements DeveloperService {
    private final DeveloperRepository developerRepository;
    @Override
    public Developer add(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public Developer findById(Integer id) {
        return developerRepository.findById(id).get();
    }

    @Override
    public Developer update(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public void delete(Integer id) {
        developerRepository.deleteById(id);
    }

    @Override
    public List<Developer> findAll() {
        return developerRepository.findAll();
    }
}
