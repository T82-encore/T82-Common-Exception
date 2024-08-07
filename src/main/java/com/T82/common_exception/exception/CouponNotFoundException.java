package com.T82.common_exception.exception;

public class CouponNotFoundException extends IllegalArgumentException{
    public CouponNotFoundException() {
        super("NOT FOUND COUPON");
    }
}
