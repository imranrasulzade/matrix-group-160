package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
