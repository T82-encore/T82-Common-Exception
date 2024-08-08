package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class FailedGenerateCouponException extends CustomException {
    public FailedGenerateCouponException() {
        super(ErrorCode.FAILED_GENERATE_COUPON);
    }
}
