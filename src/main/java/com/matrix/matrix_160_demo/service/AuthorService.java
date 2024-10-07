package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.dto.AuthorDto;
import com.matrix.matrix_160_demo.entity.Author;
import com.matrix.matrix_160_demo.mapper.AuthorMapper;
import com.matrix.matrix_160_demo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    public void update(AuthorDto authorDto) {
        Author author = authorRepository.findById(authorDto.getId()).orElseThrow(() -> new RuntimeException("Author not found"));
        authorMapper.toEntityForUpdate(authorDto, author);
        authorRepository.save(author);
    }

    public void add(AuthorDto authorDto) {
        Author author = authorMapper.toEntity(authorDto);
        authorRepository.save(author);
    }

    public AuthorDto getById(Long id){
        return authorRepository.findById(id).map(authorMapper::toDto).orElseThrow(()-> new RuntimeException("Author not found"));
    }
}
