package com.T82.common_exception.exception.category;

import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.exception.ErrorCode;

public class ParentCategoryNotFoundException extends CustomException {
    public ParentCategoryNotFoundException() {
        super(ErrorCode.PARENT_CATEGORY_NOT_FOUND);
    }
}
