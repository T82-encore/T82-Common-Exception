package com.T82.common_exception.exception.payment;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class PaymentLogNotFound extends CustomException {
    public PaymentLogNotFound() {
        super(ErrorCode.PAYMENTLOG_NOT_FOUND);
    }
}
