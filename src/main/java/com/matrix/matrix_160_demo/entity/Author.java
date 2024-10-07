package com.matrix.matrix_160_demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String nationality;
    private Boolean status;

    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
