package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
