package com.aop.proxy;

public class Main {

    public static void main(String[] args) {
        JiShuQi proxy=new LoggingProxy(new JiShuQiImpl()).getLoggingProxy();
        int r=proxy.add(4,5);
        System.out.println("result="+r);
    }
}
