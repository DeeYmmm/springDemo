package com.aop.xmlaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("aop-xml.xml");
        JiShuQi jiShuQi= (JiShuQi) ctx.getBean("impl");

        int i=jiShuQi.add(10,5);
        System.out.println("result="+i);

        i=jiShuQi.div(100,10);
        System.out.println("result="+i);
    }
}
