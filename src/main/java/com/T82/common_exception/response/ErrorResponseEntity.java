package com.T82.common_exception.response;

import com.T82.common_exception.exception.ErrorCode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponseEntity {
    private int status;
    private String name;
    private String code;
    private String message;

    public static ErrorResponseEntity fromErrorCode(ErrorCode e) {
        return ErrorResponseEntity.builder()
                .status(e.getHttpStatus().value())
                .name(e.name())
                .code(e.getCode())
                .message(e.getMessage())
                .build();
    }
}