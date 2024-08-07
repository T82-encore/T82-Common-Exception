package com.T82.common_exception.utils;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class ExceptionUtil {
    public static CustomException createCustomException(ErrorCode errorCode) {
        return new CustomException(errorCode);
    }
}