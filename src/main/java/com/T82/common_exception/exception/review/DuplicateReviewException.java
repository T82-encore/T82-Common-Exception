package com.T82.common_exception.exception.review;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class DuplicateReviewException extends CustomException {
    public DuplicateReviewException() {
        super(ErrorCode.DUPLICATE_REVIEW);
    }
}
