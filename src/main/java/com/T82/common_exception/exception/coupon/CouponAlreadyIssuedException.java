package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class CouponAlreadyIssuedException extends CustomException {
    public CouponAlreadyIssuedException() {
        super(ErrorCode.COUPON_ALREADY_ISSUED);
    }
}