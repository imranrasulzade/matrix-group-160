package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {


    @Query("SELECT p FROM Product p WHERE "
            + "(:status IS NULL OR p.status = :status) AND "
            + "(:branch IS NULL OR p.branch = :branch) AND "
            + "(:colour IS NULL OR p.colour = :colour)")
    List<Product> findByStatusAndBranchAndColour(
            @Param("status") Boolean status,
            @Param("branch") String branch,
            @Param("colour") String colour);

}


