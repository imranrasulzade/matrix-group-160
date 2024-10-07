package com.matrix.matrix_160_demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GEHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionDTO handleNotFound(NotFoundException ex) {
        log.error("Action.error.log -> NOT_FOUND: {}", ex.getMessage());
        return ExceptionDTO.builder().message(ex.getMessage()).code(HttpStatus.NOT_FOUND.value()).build();
    }


    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDTO handleNotFound(RuntimeException ex) {
        log.error("Action.error.log -> NOT_FOUND: {}", ex.getMessage());
        return ExceptionDTO.builder().message(ex.getMessage()).code(HttpStatus.BAD_REQUEST.value()).build();
    }




}
