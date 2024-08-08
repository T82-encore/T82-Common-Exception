package com.T82.common_exception.exception.upload;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class FailedUploadContent extends CustomException {
    public FailedUploadContent() {
        super(ErrorCode.FAILED_UPLOAD_CONTENT);
    }
}
