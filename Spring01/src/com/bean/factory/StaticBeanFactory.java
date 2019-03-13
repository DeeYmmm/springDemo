package com.bean.factory;

import java.util.HashMap;
import java.util.Map;

//静态工厂
public class StaticBeanFactory {
    private static Map<String,Person> map=new HashMap<>();

    static {
        map.put("张三",new Person("张三"));
        map.put("王五",new Person("王五"));
    }

    public static Person getPerson(String name){
        return map.get(name);
    }
}
