package com.aop.proxy;

import java.lang.reflect.Proxy;

public class TestProxy1 {

    public static Object getProxy(Object obj, MyinvocationHandler mih){
        Object proxy=Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),mih);
        return proxy;
    }

    public static void main(String[] args) {
        JiShuQi ji=new JiShuQiImpl();
        JiShuQi jProxy= (JiShuQi) getProxy(ji,new MyinvocationHandler(ji));
        int result=jProxy.add(1,2);
    }
}


