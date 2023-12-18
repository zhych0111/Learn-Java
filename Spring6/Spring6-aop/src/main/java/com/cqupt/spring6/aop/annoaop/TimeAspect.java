package com.cqupt.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class TimeAspect {
    @Before(value = "execution(public int com.cqupt.spring6.aop.annoaop.CalculatorImpl.*(..))") // value是切入点表达式
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("time前置通知，方法名称：" + methodName + "， 参数：" + Arrays.toString(args));
    }
}
