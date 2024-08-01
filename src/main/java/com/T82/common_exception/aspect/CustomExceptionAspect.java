package com.T82.common_exception.aspect;

import com.T82.common_exception.annotation.HandleCustomException;
import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.response.ErrorResponseEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomExceptionAspect {

    @Around("@annotation(handleCustomException)")
    public Object handleCustomExceptionAdvice(ProceedingJoinPoint joinPoint, HandleCustomException handleCustomException) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (Throwable ex) {
            Class<? extends Throwable> exceptionClass = handleCustomException.value();
            if (exceptionClass.isAssignableFrom(ex.getClass())) {
                if (ex instanceof CustomException) {
                    CustomException customException = (CustomException) ex;
                    return ErrorResponseEntity.toResponseEntity(customException.getErrorCode());
                }
            }
            throw ex;
        }
    }
}