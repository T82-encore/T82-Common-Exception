package com.T82.common_exception.exception.ticket;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class NotFoundTicketException extends CustomException {
    public NotFoundTicketException() {
        super(ErrorCode.NOT_FOUND_TICKET);
    }
}
