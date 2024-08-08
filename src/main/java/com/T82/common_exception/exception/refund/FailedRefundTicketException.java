package com.T82.common_exception.exception.refund;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class FailedRefundTicketException extends CustomException {
    public FailedRefundTicketException() {
        super(ErrorCode.FAILED_REFUND_TICKET);
    }
}
