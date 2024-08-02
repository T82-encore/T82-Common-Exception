package com.T82.common_exception.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    /**
     * ******************************* Coupon Error CodeList ***************************************
     * HTTP Status Code
     * 400 : Bad Request
     * 401 : Unauthorized
     * 403 : Forbidden
     * 404 : Not Found
     * 500 : Internal Server Error
     * *********************************************************************************************
     */
    COUPON_NOT_FOUND(HttpStatus.NOT_FOUND, "COUPON-001", "쿠폰을 찾을 수 없습니다."),
    COUPON_CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND, "COUPON-002", "존재하지 않는 카테고리 입니다."),
    MIN_PURCHASE_NOT_ACCEPT(HttpStatus.BAD_REQUEST, "COUPON-003", "쿠폰을 사용할 수 있는 최소 금액을 만족하지 않습니다."),
    COUPON_EXPIRED(HttpStatus.BAD_REQUEST, "COUPON-004", "만료된 쿠폰입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}