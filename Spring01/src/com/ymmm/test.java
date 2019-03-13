package com.ymmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        Person person= (Person) ctx.getBean("person");
        System.out.println(person);

        /**person= (Person) ctx.getBean("person2");
        System.out.println(person);

        person= (Person) ctx.getBean("person3");
        System.out.println(person);

        person= (Person) ctx.getBean("person4");
        System.out.println(person);*/
    }
}
