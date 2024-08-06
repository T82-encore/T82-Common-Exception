package com.T82.common_exception.util;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class ExceptionUtil {

    public static void throwCustomException(ErrorCode errorCode) {
        throw new CustomException(errorCode);
    }

    public static void throwCustomException(ErrorCode errorCode, Throwable cause) {
        throw new CustomException(errorCode, cause);
    }
}