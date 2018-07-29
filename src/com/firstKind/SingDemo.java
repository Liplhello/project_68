package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class SingDemo {
    String name = null;

    private SingDemo() {
    }

    private static volatile SingDemo instance = null;

    public static SingDemo getInstance() {
        if (instance == null) {
            synchronized (SingDemo.class) {
                if (instance == null) {
                    instance = new SingDemo();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("the name is " + name);
    }
}
