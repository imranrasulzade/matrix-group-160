package com.matrix.matrix_160_demo.mapper;

import com.matrix.matrix_160_demo.dto.BookDto;
import com.matrix.matrix_160_demo.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class BookMapper {
    public abstract Book toEntity(BookDto bookDto);

//    @Mapping(source = "authorId", target = "author.id")
    public abstract BookDto toDto(Book book);
}
