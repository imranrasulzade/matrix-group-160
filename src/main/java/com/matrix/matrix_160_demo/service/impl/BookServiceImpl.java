package com.matrix.matrix_160_demo.service.impl;

import com.matrix.matrix_160_demo.dto.BookDto;
import com.matrix.matrix_160_demo.entity.Author;
import com.matrix.matrix_160_demo.entity.Book;
import com.matrix.matrix_160_demo.mapper.BookMapper;
import com.matrix.matrix_160_demo.repositories.AuthorRepository;
import com.matrix.matrix_160_demo.repositories.BookRepository;
import com.matrix.matrix_160_demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final BookMapper bookMapper;


    @Override
    public void add(BookDto bookDto) {
//        Author author = authorRepository.findById(bookDto.getAuthorId())
//                .orElseThrow(() -> new RuntimeException("Author not found"));
//        Book book = bookMapper.toEntity(bookDto);
//        book.setAuthor(author);
//        bookRepository.save(book);
    }

}
