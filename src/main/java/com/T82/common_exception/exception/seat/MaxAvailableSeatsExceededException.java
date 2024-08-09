package com.T82.common_exception.exception.seat;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class MaxAvailableSeatsExceededException extends CustomException {
    public MaxAvailableSeatsExceededException() {
        super(ErrorCode.MAX_AVAILABLE_SEATS_EXCEEDED);
    }
}
