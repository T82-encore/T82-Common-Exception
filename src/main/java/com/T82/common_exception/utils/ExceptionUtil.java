package com.T82.common_exception.utils;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;
import org.springframework.stereotype.Component;

@Component
public class ExceptionUtil {
    public static CustomException createCustomException(ErrorCode errorCode) {
        return new CustomException(errorCode);
    }
}