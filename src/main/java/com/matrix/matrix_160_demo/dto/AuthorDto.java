package com.matrix.matrix_160_demo.dto;

import lombok.Data;

@Data
public class AuthorDto {
    private Long id;
    private String name;
    private String surname;
    private String nationality;
    private Boolean status;
}
