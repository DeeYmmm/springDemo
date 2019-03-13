package com.bean.depend;

public class Car {
    private String pingPai;
    private String changShang;

    public String getPingPai() {
        return pingPai;
    }

    public void setPingPai(String pingPai) {
        this.pingPai = pingPai;
    }

    public String getChangShang() {
        return changShang;
    }

    public void setChangShang(String changShang) {
        this.changShang = changShang;
    }

    public Car() {
    }

    public Car(String pingPai, String changShang) {
        this.pingPai = pingPai;
        this.changShang = changShang;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pingPai='" + pingPai + '\'' +
                ", changShang='" + changShang + '\'' +
                '}';
    }
}
