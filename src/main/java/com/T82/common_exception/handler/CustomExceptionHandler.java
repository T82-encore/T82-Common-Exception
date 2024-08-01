package com.T82.common_exception.handler;

import com.T82.common_exception.response.ErrorResponseEntity;
import com.T82.common_exception.exception.CustomException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    protected ErrorResponseEntity handleCustomException(CustomException e) {
        return ErrorResponseEntity.fromErrorCode(e.getErrorCode());
    }
}