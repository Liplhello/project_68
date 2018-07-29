package com.firstKind;

/**
 * Created by lpl on 2018/7/5.
 */
public class Cat implements Pet {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
