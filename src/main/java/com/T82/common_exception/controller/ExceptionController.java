package com.T82.common_exception.controller;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.SeatNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Map<String, String>> handleCustomException(CustomException e) {
        log.error("ERROR : CustomException ({} - {})", e.getCode(), e.getMessage(), e);

        // HTTP 상태 코드와 메시지를 반환합니다.
        Map<String, String> response = new HashMap<>();
        response.put("code", e.getCode());
        response.put("message", e.getMessage());

        return ResponseEntity
                .status(e.getHttpStatus())
                .body(response);
    }
}
