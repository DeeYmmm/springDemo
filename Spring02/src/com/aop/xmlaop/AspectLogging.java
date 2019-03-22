package com.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;

public class AspectLogging {

    //前置通知，执行于方法前
    public void before(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        List<Object> list= Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+methodName+" begins with"+list);
    }

    //后置通知，执行于方法后，且无论方法能否正常执行，是否有异常，都执行此通知
    public void after(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("The method "+methodName+" ends");

    }

    //返回通知，只有方法正常执行时，才执行此通知,可以访问到方法的返回值
    public void afterReturn(JoinPoint joinPoint, Object result){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("The method "+methodName+" end with "+result);
    }

    //异常通知，在方法执行出现异常时执行，可以访问异常信息
    public void afterThowing(JoinPoint joinPoint, Exception ex){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("The method "+methodName+" occus exception: "+ex);

    }


    /*环绕通知，类似于动态代理的全过程，在其中可以实现前置，返回，后置，异常通知的全部功能
    * 必须携带 ProceedingJoinPoint 类型的参数
    * 必须有返回值，即方法的返回值
    * */
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object result=null;
        String methodName=proceedingJoinPoint.getSignature().getName();

        try {
            //前置通知
            System.out.println("The method "+methodName+" begins with "
                    +Arrays.asList(proceedingJoinPoint.getArgs()));
            //执行方法
            result=proceedingJoinPoint.proceed();
            //返回通知
            System.out.println("The method "+methodName+" end with "+result);
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("The method "+methodName+" occus exception: "+throwable);
            throwable.printStackTrace();
        }
        //后置通知
        System.out.println("The method "+methodName+" ends");
        return result;
    }

}
