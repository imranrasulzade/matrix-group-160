package com.matrix.matrix_160_demo.mapper;

import com.matrix.matrix_160_demo.dto.AuthorDto;
import com.matrix.matrix_160_demo.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class AuthorMapper {

    public abstract Author toEntity(AuthorDto authorDto);
    public abstract AuthorDto toDto(Author author);

    public abstract void toEntityForUpdate(AuthorDto authorDto, @MappingTarget Author author);
}
