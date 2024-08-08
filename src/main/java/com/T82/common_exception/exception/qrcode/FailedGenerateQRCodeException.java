package com.T82.common_exception.exception.qrcode;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class FailedGenerateQRCodeException extends CustomException {
    public FailedGenerateQRCodeException() {
        super(ErrorCode.FAILED_GENERATE_QRCODE);
    }
}