package com.bean.depend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("depend.xml");
        Car car1= (Car) ctx.getBean("car1");
        System.out.println(car1);

        Parents parents= (Parents) ctx.getBean("parents1");
        System.out.println(parents);

        Person person= (Person) ctx.getBean("person1");
        System.out.println(person);

    }
}
