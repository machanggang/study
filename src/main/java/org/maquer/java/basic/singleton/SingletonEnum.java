package org.maquer.java.basic.singleton;

import java.util.HashMap;
import java.util.Map;

public enum SingletonEnum {
    INSTANCE;

    private Map<String, String> map = null;

    public void init() {
        System.out.println("初始化单例模式...");
        map = new HashMap<String, String>();
        map.put("1", "a");
    }
    public Map<String, String> getMap() {
        return map;
    }
}
