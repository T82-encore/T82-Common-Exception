package com.T82.common_exception.exception;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin()
public class SeatNotFoundException extends CustomException{
    public SeatNotFoundException() {
        super(ErrorCode.SEAT_NOT_FOUND);
    }
}
