package com.T82.common_exception.exception.ticket;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class FailedGenerateTicketException extends CustomException {
    public FailedGenerateTicketException() {
        super(ErrorCode.FAILED_GENERATE_TICKET);
    }
}
