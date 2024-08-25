package com.matrix.matrix_160_demo.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String phone;
        
}
