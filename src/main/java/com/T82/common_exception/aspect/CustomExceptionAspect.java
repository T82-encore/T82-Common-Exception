package com.T82.common_exception.aspect;

import com.T82.common_exception.annotation.HandleCustomException;
import com.T82.common_exception.exception.CustomException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomExceptionAspect {

    @Around("@annotation(handleException)")
    public Object handleException(ProceedingJoinPoint joinPoint, HandleCustomException handleException) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (Exception e) {
            throw new CustomException(handleException.value());
        }
    }
}