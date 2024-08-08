package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class CouponValidateFailedException extends CustomException {
    public CouponValidateFailedException() {
        super(ErrorCode.COUPON_VALIDATE_FAILED);
    }
}