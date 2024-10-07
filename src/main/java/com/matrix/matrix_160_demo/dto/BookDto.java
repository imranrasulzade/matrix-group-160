package com.matrix.matrix_160_demo.dto;

import com.matrix.matrix_160_demo.enums.BookType;
import lombok.Data;

@Data
public class BookDto {
    private Long id;
    private String title;
    private Boolean status;
    private BookType bookType;
    private AuthorDto author;
}
