package com.bean.postprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("postprocessor.xml");
        Person p1= (Person) ctx.getBean("person");
        System.out.println(p1);
        ctx.close();
    }
}
