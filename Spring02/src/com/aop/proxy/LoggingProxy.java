package com.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LoggingProxy {
    private JiShuQi target;

    public LoggingProxy(JiShuQi target){
        this.target=target;
    }

    public JiShuQi getLoggingProxy(){
        JiShuQi proxy = null;
        //代理对象的类加载器
        ClassLoader loader=target.getClass().getClassLoader();
        //代理对象所实现的接口
        Class[] interfaces=new Class[]{JiShuQi.class};
        //调用处理器，即调用代理对象中的方法是所需要执行的代码
        InvocationHandler invocationHandler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result;
                String methodName=method.getName();
                System.out.println("The method "+methodName+" begins with "+ Arrays.asList(args));
                System.out.println(Arrays.toString(interfaces));

                //执行代理对象的方法
                result = method.invoke(target,args);

                System.out.println("The method "+methodName+" ends with "+result);
                return result;
            }
        };

        proxy= (JiShuQi) Proxy.newProxyInstance(loader,interfaces,invocationHandler);
        return proxy;
    }
}
