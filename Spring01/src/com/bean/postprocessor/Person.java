package com.bean.postprocessor;

public class Person {
    private String name;

    public Person(){
        System.out.println("Construstor...");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }

    public void init(){
        System.out.println("Init");
    }

    public void destory(){
        System.out.println("Destory");
    }
}
