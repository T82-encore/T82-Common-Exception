package com.T82.common_exception.aspect;

import com.T82.common_exception.annotation.HandleCouponNotFoundException;
import com.T82.common_exception.annotation.HandleCustomException;
import com.T82.common_exception.exception.CustomException;
import com.T82.common_exception.response.ErrorResponseEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomExceptionAspect {

    // HandleCustomException 어노테이션이 붙은 메서드를 대상으로 포인트컷 정의
    @Around("@annotation(handleCustomException)")
    public Object handleCustomExceptionAdvice(ProceedingJoinPoint joinPoint, HandleCustomException handleCustomException) throws Throwable {
        try {
            // 메서드 실행
            return joinPoint.proceed();
        } catch (CustomException ex) {
            // 지정된 예외 클래스와 예외가 일치하는 경우 처리
            if (handleCustomException.value().isAssignableFrom(ex.getClass())) {
                // 에러 응답 생성
                return ErrorResponseEntity.toResponseEntity(ex.getErrorCode());
            }
            // 다른 예외는 다시 던짐
            throw ex;
        }
    }
}