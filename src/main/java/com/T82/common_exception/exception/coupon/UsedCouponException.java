package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class UsedCouponException extends CustomException {
    public UsedCouponException() {
        super(ErrorCode.USED_COUPON);
    }
}
