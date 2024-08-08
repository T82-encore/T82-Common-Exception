package com.T82.common_exception.aspect;

import com.T82.common_exception.annotation.ExecutionTimeLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Component
@Aspect
public class LogAspect {
    @Around("@annotation(executionTimeLog)")
    public Object ExecutionTimeLog(ProceedingJoinPoint joinPoint, ExecutionTimeLog executionTimeLog) throws Throwable{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        log.info(stopWatch.prettyPrint());

        return proceed;
    }
}
