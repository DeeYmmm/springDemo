package com.bean.depend;

public class Person {
    private String name;
    private Parents parents;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person() {
    }

    public Person(String name, Parents parents, Car car) {
        this.name = name;
        this.parents = parents;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", parents=" + parents +
                ", car=" + car +
                '}';
    }
}
