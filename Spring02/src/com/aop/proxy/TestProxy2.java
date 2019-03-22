package com.aop.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class TestProxy2 {

    /**
     * 一个通用的动态代理
     * @param obj 被代理对象
     * @return
     */
    public static Object getProxy(Object obj){
        InvocationHandler in=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("The method "+method.getName()+" begins with "+ Arrays.asList(args));
                Object result=method.invoke(obj,args);
                System.out.println("The method "+method.getName()+" ends with "+result);
                return result;
            }
        };

        Object proxy= Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),in);

        return proxy;
    }

    @Test
    public void test(){
        //创建被代理对象
        JiShuQi j=new JiShuQiImpl();
        //获取代理对象
        JiShuQi proxy= (JiShuQi) getProxy(j);
        proxy.add(1,2);
    }

}
