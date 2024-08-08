package com.T82.common_exception.exception.seat;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class EventInfoNotFoundException extends CustomException {
    public EventInfoNotFoundException() {
        super(ErrorCode.EVENT_INFO_NOT_FOUND);
    }
}
