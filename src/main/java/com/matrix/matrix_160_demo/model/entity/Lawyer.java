package com.matrix.matrix_160_demo.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "lawyer")
@Data
public class Lawyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int score;
}
