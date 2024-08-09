package com.T82.common_exception.exception.seat;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class MaxSeatException extends CustomException {
    public MaxSeatException() {
        super(ErrorCode.SEAT_NOT_FOUND);
    }
}
