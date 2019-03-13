package com.ymmm;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private String sax;
    private List<String> children;
    /*private Map<Integer,String> wu;*/

    public Person(String name, int age, String sax) {
        this.name = name;
        this.age = age;
        this.sax = sax;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sax='" + sax + '\'' +
                ", children=" + children +
                '}';
    }

    public Person(String name, int age, String sax, List<String> children) {
        this.name = name;
        this.age = age;
        this.sax = sax;
        this.children = children;
    }

    public String getSax() {
        return sax;
    }

    public void setSax(String sax) {
        //System.out.println("调用setSax");
        this.sax = sax;
    }

    public void setName(String name) {
        //System.out.println("调用setName");
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        //System.out.println("调用setAge");
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setChildren(List<String> children) {
        //System.out.println("调用setChildren");
        this.children = children;
    }
    public List<String> getChildren() {
        return children;
    }

    public Person(){
        System.out.println("调用无参构造器");
    }

    public Person(String name, String sax) {
        this.name = name;
        this.sax = sax;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void init(){
        System.out.println("Init...");
    }


}
