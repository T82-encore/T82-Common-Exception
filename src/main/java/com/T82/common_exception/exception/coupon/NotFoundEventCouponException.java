package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class NotFoundEventCouponException extends CustomException {
    public NotFoundEventCouponException() {
        super(ErrorCode.NOT_FOUND_EVENT_COUPON);
    }
}
