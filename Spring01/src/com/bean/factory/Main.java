package com.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("factory.xml");
        Person person= (Person) ctx.getBean("person1");
        System.out.println(person);

        person= (Person) ctx.getBean("person2");
        System.out.println(person);

    }
}
