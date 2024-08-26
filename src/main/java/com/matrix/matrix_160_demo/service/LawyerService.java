package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.model.entity.Lawyer;

public interface LawyerService {
   Lawyer add(Lawyer lawyer );
   Lawyer findById(Integer id);
    Lawyer update(Lawyer lawyer);
    void delete(Integer id);
}
