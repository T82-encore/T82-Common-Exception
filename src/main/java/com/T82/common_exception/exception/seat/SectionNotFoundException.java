package com.T82.common_exception.exception.seat;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class SectionNotFoundException extends CustomException {
    public SectionNotFoundException() {
        super(ErrorCode.SECTION_NOT_FOUND);
    }
}
