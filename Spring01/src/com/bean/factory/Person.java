package com.bean.factory;

public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(){
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }

}
