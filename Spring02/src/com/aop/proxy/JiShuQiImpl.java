package com.aop.proxy;

public class JiShuQiImpl implements JiShuQi {
    @Override
    public int add(int i, int j) {
        System.out.println("执行 add 方法");
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return i-j;
    }

    @Override
    public int div(int i, int j) {
        return i/j;
    }
}
