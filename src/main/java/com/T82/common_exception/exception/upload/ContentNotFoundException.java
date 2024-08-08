package com.T82.common_exception.exception.upload;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class ContentNotFoundException extends CustomException {
    public ContentNotFoundException() {
        super(ErrorCode.CONTENT_NOT_FOUND);
    }
}
