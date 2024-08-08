package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class CouponCategoryNotFoundException extends CustomException {
    public CouponCategoryNotFoundException() {
        super(ErrorCode.COUPON_CATEGORY_NOT_FOUND);
    }
}
