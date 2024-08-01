package com.T82.common_exception.aop;

import com.T82.common_exception.annotation.HandleCustomException;
import com.T82.common_exception.custom.CustomException;
import com.T82.common_exception.dto.ErrorResponseEntity;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomExceptionAspect {

    @Pointcut("@annotation(handleCustomException)")
    public void handleCustomExceptionPointcut(HandleCustomException handleCustomException) {}

    @AfterThrowing(pointcut = "handleCustomExceptionPointcut(handleCustomException)", throwing = "ex")
    public void handleCustomExceptionAdvice(HandleCustomException handleCustomException, CustomException ex) {
        // ErrorResponseEntity.toResponseEntity를 이용해 에러 응답을 처리
        ResponseEntity<ErrorResponseEntity> responseEntity = ErrorResponseEntity.toResponseEntity(ex.getErrorCode());
        // 여기서 필요한 추가 처리를 수행
    }
}