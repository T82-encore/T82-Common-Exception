package com.T82.common_exception.exception.user;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class EmailNotFoundException extends CustomException {
    public EmailNotFoundException() {
        super(ErrorCode.EMAIL_NOT_FOUND);
    }
}
