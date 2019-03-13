package com.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("test.xml");
        Test test= (Test) ctx.getBean("test1");
        Test test1= (Test) ctx.getBean("test1");
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test1.equals(test));
        Person person= (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
