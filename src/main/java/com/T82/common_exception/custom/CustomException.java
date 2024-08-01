package com.T82.common_exception.custom;

import com.T82.common_exception.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException {
    ErrorCode errorCode;
}
