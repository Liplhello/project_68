package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Person6_3 {
    private String name;
    private String addr;
    private int age;
    private char sex;

    public Person6_3() {
    }

    public Person6_3(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person6_3(String addr, int age, String name, char sex) {

        this.addr = addr;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名:" + this.name + ",年龄:" + this.age
                + ",性别:" + this.sex + ",住址:" + this.addr;
    }
}
