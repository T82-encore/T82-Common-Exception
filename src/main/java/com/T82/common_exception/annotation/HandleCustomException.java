package com.T82.common_exception.annotation;

import com.T82.common_exception.custom.CustomException;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface HandleCustomException {
    Class<? extends CustomException> value();
}