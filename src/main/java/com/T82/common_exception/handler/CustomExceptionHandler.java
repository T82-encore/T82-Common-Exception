package com.T82.common_exception.handler;

import com.T82.common_exception.exception.ErrorCode;
import com.T82.common_exception.response.ErrorResponseEntity;
import com.T82.common_exception.exception.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorResponseEntity> handleCustomException(CustomException e) {
        ErrorResponseEntity errorResponse = ErrorResponseEntity.fromErrorCode(e.getErrorCode());
        return ResponseEntity.status(errorResponse.getStatus()).body(errorResponse);
    }
}