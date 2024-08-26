package com.matrix.matrix_160_demo.service.impl;

import com.matrix.matrix_160_demo.model.entity.Lawyer;
import com.matrix.matrix_160_demo.repasitory.LawyerRepasitory;
import com.matrix.matrix_160_demo.service.LawyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LawyerServiceImpl implements LawyerService {
    private final LawyerRepasitory lawyerRepasitory;

    @Override
    public Lawyer add(Lawyer lawyer) {
        return lawyerRepasitory.save(lawyer);
    }

    @Override
    public Lawyer findById(Integer id) {

        return lawyerRepasitory.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public Lawyer update(Lawyer lawyer) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
