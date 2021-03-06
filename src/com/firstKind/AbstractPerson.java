package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public abstract class AbstractPerson {
    private String name;
    private int age;

    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getInfo();
}
