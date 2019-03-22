package com.aop.before;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
@Aspect
@Component(value = "valide")
public class ValidationAspect {
    @Before(value = "AspectLogging.declareJoinPOint()")
    void validation(JoinPoint joinPoint){
        System.out.println("Validate: "+ Arrays.asList(joinPoint.getArgs()));
        /*String methodNAme=joinPoint.getSignature().getName();
        System.out.println("The method "+methodNAme+" validated");*/

    }
}
