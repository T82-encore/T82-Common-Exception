package com.T82.common_exception.exception;

public class SeatNotFoundException extends CustomException{
    public SeatNotFoundException() {
        super(ErrorCode.MIN_PURCHASE_NOT_ACCEPTED);
    }
}
