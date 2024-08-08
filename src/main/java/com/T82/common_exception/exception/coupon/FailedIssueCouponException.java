package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class FailedIssueCouponException extends CustomException {
    public FailedIssueCouponException() {
        super(ErrorCode.FAILED_ISSUE_COUPON);
    }
}
