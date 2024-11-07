package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggingAspect {
    private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    
    // @Around("execution(* org.example.*.*(..))")
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        // 원하는 AOP 로직
        logger.info("메서드가 실행되기 전");

        // 원래 메서드의 이름
        String methodName = joinPoint.getSignature().getName();
        // 원래 메서드가 호출될 때 파라미터
        Object[] params = joinPoint.getArgs();
        logger.info("메서드 이름 : " + methodName + ", 파라메터: " + Arrays.asList(params));

        CommentInfo newInfo = new CommentInfo();
        newInfo.setText("가입을 거부합니다.");
        newInfo.setAuthor("SUPER_ADMIN");

        Object[] newParams = {newInfo};

        // 원래 타겟 메서드를 대신 실행
        // + 입력값을 변조
        // + 반환값을 변조
        Object returnValue = joinPoint.proceed(newParams);
        logger.info("반환값 : " + returnValue);

        // 원하는 AOP 로직
        logger.info("메서드가 실행된 후");

        return returnValue;
    }

}
