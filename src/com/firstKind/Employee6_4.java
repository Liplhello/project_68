package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Employee6_4 {
    private String name;
    private int age;
    private char sex;

    public Employee6_4() {
    }

    public Employee6_4(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名" + this.name + ",年龄:" + this.age
                + ",性别:" + this.sex;
    }
}
