package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class CouponExpiredException extends CustomException {
    public CouponExpiredException() {
        super(ErrorCode.COUPON_EXPIRED);
    }
}
