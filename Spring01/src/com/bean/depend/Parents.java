package com.bean.depend;

public class Parents {
    private String mother;
    private String father;

    public Parents() {
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}
