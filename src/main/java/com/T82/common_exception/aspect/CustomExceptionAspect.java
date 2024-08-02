package com.T82.common_exception.aspect;

import com.T82.common_exception.annotation.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CustomExceptionAspect {

    @Around("@annotation(handleException)")
    public Object handleException(ProceedingJoinPoint joinPoint, CustomException handleException) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (com.T82.common_exception.exception.CustomException e) {
            log.error("ERROR : {} ({})", e.getErrorCode().getMessage(), e.getErrorCode().getCode());
            throw e;
        } catch (Exception e) {
            com.T82.common_exception.exception.CustomException customException = new com.T82.common_exception.exception.CustomException(handleException.value(), e);
            log.error("ERROR : {} ({})", customException.getErrorCode().getMessage(), customException.getErrorCode().getCode());
            throw customException;
        }
    }
}