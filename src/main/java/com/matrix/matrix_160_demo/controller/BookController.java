package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.dto.BookDto;
import com.matrix.matrix_160_demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public void add(@RequestBody BookDto bookDto){
        bookService.add(bookDto);
    }
}
