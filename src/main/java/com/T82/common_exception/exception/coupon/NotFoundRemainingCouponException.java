package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class NotFoundRemainingCouponException extends CustomException {
    public NotFoundRemainingCouponException() {
        super(ErrorCode.NOT_FOUND_REMAINING_COUPON);
    }
}
