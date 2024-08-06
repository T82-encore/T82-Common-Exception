package com.T82.common_exception.util;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class ExceptionUtils {
    public static CustomException createCustomException(ErrorCode errorCode) {
        return new CustomException(errorCode);
    }
}