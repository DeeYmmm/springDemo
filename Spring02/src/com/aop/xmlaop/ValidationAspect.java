package com.aop.xmlaop;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class ValidationAspect {
    void validation(JoinPoint joinPoint){
        System.out.println("Validate: "+ Arrays.asList(joinPoint.getArgs()));
        /*String methodNAme=joinPoint.getSignature().getName();
        System.out.println("The method "+methodNAme+" validated");*/

    }
}
