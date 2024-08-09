package com.T82.common_exception.exception.seat;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class SeatAlreadyChosenException extends CustomException {
    public SeatAlreadyChosenException() {
        super(ErrorCode.SEAT_ALREADY_CHOSEN);
    }
}
