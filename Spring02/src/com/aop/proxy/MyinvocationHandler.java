package com.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyinvocationHandler implements InvocationHandler {
    Object obj;

    public MyinvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前");
        Object result=method.invoke(obj,args);
        System.out.println("后");
        System.out.println("执行结果为："+result);
        return result;
    }
}
