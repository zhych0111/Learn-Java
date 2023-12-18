package com.cqupt.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component // ioc容器
@Aspect //这是一个切面类
public class LogAspect {
    // 设置切入点和通知类型
    // 通知类型：前置通知 返回通知 异常通知 后置通知 环绕通知
    @Before(value = "execution(public int com.cqupt.spring6.aop.annoaop.CalculatorImpl.*(..))") // value是切入点表达式
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("logger前置通知，方法名称：" + methodName + "， 参数：" + Arrays.toString(args));
    }

    @After(value = "execution(public int com.cqupt.spring6.aop.annoaop.CalculatorImpl.*(..))") // value是切入点表达式
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("logger后置通知，方法名称：" + methodName + "， 参数：" + Arrays.toString(args));
    }

    @AfterReturning(value = "execution(* com.cqupt.spring6.aop.annoaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果："+result);
    }

    @AfterThrowing(value = "execution(* com.cqupt.spring6.aop.annoaop.CalculatorImpl.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名："+methodName+"，异常："+ex);
    }

//    @Around(value = "execution(* com.cqupt.spring6.aop.annoaop.CalculatorImpl.*(..))")
//    public Object aroundMethod(ProceedingJoinPoint joinPoint){
//        String methodName = joinPoint.getSignature().getName();
//        String args = Arrays.toString(joinPoint.getArgs());
//        Object result = null;
//        try {
//            System.out.println("环绕通知-->目标对象方法执行之前");
//            //目标方法的执行，目标方法的返回值一定要返回给外界调用者
//            result = joinPoint.proceed();
//            System.out.println("环绕通知-->目标对象方法返回值之后");
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//            System.out.println("环绕通知-->目标对象方法出现异常时");
//        } finally {
//            System.out.println("环绕通知-->目标对象方法执行完毕");
//        }
//        return result;
//    }
}
