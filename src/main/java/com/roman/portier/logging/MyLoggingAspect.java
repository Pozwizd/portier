package com.roman.portier.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

//    @Around("execution(* com.roman.portier.service.*(..))")
//    public Object aroundAllServiceMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
//        String methodName = methodSignature.getName();
//        System.out.println("Begin of " + methodName);
//        Object targetMethodResult = proceedingJoinPoint.proceed();
//        System.out.println("End of " + methodName);
//        return targetMethodResult;
//    }
}
