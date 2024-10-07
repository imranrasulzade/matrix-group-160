package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.dto.AuthorDto;
import com.matrix.matrix_160_demo.exception.NotFoundException;
import com.matrix.matrix_160_demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PutMapping
    public void update(@RequestBody AuthorDto dto) {
        authorService.update(dto);
    }


    @PostMapping
    public void add(@RequestBody AuthorDto dto) {
        authorService.add(dto);
    }

    @GetMapping("{id}")
    public AuthorDto get(@PathVariable Long id) {
        return authorService.getById(id);
    }


    @GetMapping
    public void ex(){
        throw new RuntimeException("xeta var");
    }
}
