package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public abstract class AbstractClass {
    public static final String FLAG = "CHINA";
    private String name = "lee";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
}
