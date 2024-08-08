package com.T82.common_exception.exception.seat;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class EventPlaceNotFoundException extends CustomException {
    public EventPlaceNotFoundException() {
        super(ErrorCode.EVENT_PLACE_NOT_FOUND);
    }
}
