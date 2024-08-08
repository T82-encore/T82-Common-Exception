package com.T82.common_exception.exception.coupon;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class MinPurchaseNotAcceptedException extends CustomException {
    public MinPurchaseNotAcceptedException() {
        super(ErrorCode.MIN_PURCHASE_NOT_ACCEPTED);
    }
}
