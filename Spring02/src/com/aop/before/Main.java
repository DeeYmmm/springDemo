package com.aop.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        JiShuQi jiShuQi= (JiShuQi) ctx.getBean("impl");
        System.out.println(jiShuQi.getClass().getName());

        int i=jiShuQi.add(10,5);
        System.out.println("result="+i);

        i=jiShuQi.div(10,10);
        System.out.println("result="+i);
    }
}
