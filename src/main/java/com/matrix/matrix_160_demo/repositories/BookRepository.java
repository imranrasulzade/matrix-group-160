package com.matrix.matrix_160_demo.repositories;

import com.matrix.matrix_160_demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
