package com.matrix.matrix_160_demo.repasitory;

import com.matrix.matrix_160_demo.model.entity.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LawyerRepasitory extends JpaRepository<Lawyer,Integer> {
}
