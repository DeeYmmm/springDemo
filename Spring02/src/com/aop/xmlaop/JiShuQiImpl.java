package com.aop.xmlaop;

public class JiShuQiImpl implements JiShuQi {
    @Override
    public int add(int i, int j) {
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
