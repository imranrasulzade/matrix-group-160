package com.matrix.matrix_160_demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double cost;
}
