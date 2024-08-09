package com.T82.common_exception.exception.category;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class WrongParentCategory extends CustomException {
    public WrongParentCategory() {
        super(ErrorCode.WRONG_PARENT_CATEGORY);
    }
}
