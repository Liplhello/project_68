package com.firstKind;

/**
 * Created by lpl on 2018/6/22.
 */
public class Dog implements Pet{
    private String color;
    private String name;
    private int age;

    public Dog(String name,String color, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
