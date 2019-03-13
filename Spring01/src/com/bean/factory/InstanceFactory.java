package com.bean.factory;

import java.util.HashMap;
import java.util.Map;

//实例工厂
public class InstanceFactory {
    private Map<String, Person> map = null;

    public InstanceFactory() {
        map=new HashMap<>();
        map.put("张三",new Person("张三"));
        map.put("王五",new Person("王五"));
    }

    public Person getPerson(String name) {
        return map.get(name);
    }
}
