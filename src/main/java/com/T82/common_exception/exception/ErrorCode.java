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
     * 409 : Conflict
     * 410 : Gone
     * 500 : Internal Server Error
     * *********************************************************************************************
     */

    /**
     * COUPON
     */
    COUPON_NOT_FOUND(HttpStatus.NOT_FOUND, "COUPON-001", "쿠폰을 찾을 수 없습니다."),
    COUPON_CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND, "COUPON-002", "존재하지 않는 카테고리입니다."),
    MIN_PURCHASE_NOT_ACCEPTED(HttpStatus.BAD_REQUEST, "COUPON-003", "쿠폰을 사용할 수 있는 최소 금액을 만족하지 않습니다."),
    COUPON_EXPIRED(HttpStatus.BAD_REQUEST, "COUPON-004", "만료된 쿠폰입니다."),
    USED_COUPON(HttpStatus.BAD_REQUEST, "COUPON-005", "이미 사용된 쿠폰입니다."),
    COUPON_VALIDATE_FAILED(HttpStatus.BAD_REQUEST, "COUPON-006", "쿠폰 검증에 실패했습니다."),
    COUPON_ALREADY_ISSUED(HttpStatus.CONFLICT, "COUPON-007", "이 쿠폰은 이미 발급되었습니다."),
    NOT_FOUND_REMAINING_COUPON(HttpStatus.NOT_FOUND, "COUPON-008", "남은 쿠폰이 없습니다."),
    FAILED_GENERATE_COUPON(HttpStatus.INTERNAL_SERVER_ERROR, "COUPON-009", "쿠폰 생성에 실패했습니다."),
    FAILED_ISSUE_COUPON(HttpStatus.INTERNAL_SERVER_ERROR, "COUPON-010", "쿠폰 발급에 실패했습니다."),
    NOT_FOUND_EVENT_COUPON(HttpStatus.NOT_FOUND, "COUPON-011", "이벤트 진행 중인 쿠폰이 없습니다."),

    /**
     * TICKET
     */
    NOT_FOUND_TICKET(HttpStatus.NOT_FOUND, "TICKET-001", "티켓을 찾을 수 없습니다."),
    FAILED_GENERATE_TICKET(HttpStatus.INTERNAL_SERVER_ERROR, "TICKET-003", "티켓 생성에 실패했습니다."),
    FAILED_REFUND_TICKET(HttpStatus.INTERNAL_SERVER_ERROR, "TICKET-001", "티켓 환불에 실패했습니다."),

    /**
     * PAYMENT
     */
    PAYMENTLOG_NOT_FOUND(HttpStatus.NOT_FOUND, "PAYMENT-001", "결제로그를 찾을 수 없습니다."),

    /**
     * DIB
     */
    ALREADY_DIB (HttpStatus.BAD_REQUEST, "DIB-001", "이미 찜 상태입니다."),


    /**
     * SEAT
     */
    EVENT_INFO_NOT_FOUND(HttpStatus.NOT_FOUND, "SEAT-001", "해당 공연 정보를 찾을 수 없습니다."),
    EVENT_NOT_FOUND(HttpStatus.NOT_FOUND, "SEAT-002", "해당 이벤트를 찾을 수 없습니다."),
    EVENT_PLACE_NOT_FOUND(HttpStatus.NOT_FOUND, "SEAT-003", "해당 장소를 찾을 수 없습니다."),
    SECTION_NOT_FOUND(HttpStatus.NOT_FOUND, "SEAT-004", "해당 구역을 찾을 수 없습니다."),

    /**
     * CATEGORY
     */
    WRONG_PARENT_CATEGORY (HttpStatus.NOT_FOUND, "CATEGORY-001", "부모 카테고리를 찾을 수 없습니다."),

    /**
     * USER
     */
    PASSWORD_MISMATCH(HttpStatus.BAD_REQUEST, "USER-001", "비밀번호가 일치하지 않습니다."),
    DUPLICATE_PHONE_NUMBER(HttpStatus.BAD_REQUEST, "USER-002", "이미 존재하는 휴대폰 번호입니다."),
    DUPLICATE_EMAIL(HttpStatus.BAD_REQUEST, "USER-003", "이미 존재하는 이메일입니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER-004", "존재하지 않는 유저입니다."),
    EMAIL_NOT_FOUND(HttpStatus.NOT_FOUND, "USER-005", "존재하지 않는 이메일입니다."),
    EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "USER-006", "토큰이 만료되었습니다."),

    /**
     * REVIEW
     */
    DUPLICATE_REVIEW(HttpStatus.BAD_REQUEST, "REVIEW-001", "이미 존재하는 리뷰입니다."),
    REVIEW_NOT_FOUND(HttpStatus.NOT_FOUND, "REVIEW-002", "리뷰가 존재하지 않습니다."),

    /**
     * UPLOAD
     */
    CONTENT_NOT_FOUND(HttpStatus.NOT_FOUND, "UPLOAD-001", "업로드할 콘텐츠가 없습니다."),
    FAILED_UPLOAD_CONTENT(HttpStatus.INTERNAL_SERVER_ERROR, "UPLOAD-002", "콘텐츠 업로드에 실패했습니다."),

    /**
     * QRCODE
     */
    FAILED_GENERATE_QRCODE(HttpStatus.INTERNAL_SERVER_ERROR, "QRCODE-001", "QR코드 생성에 실패했습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}