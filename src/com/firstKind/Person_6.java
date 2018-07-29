package com.firstKind;

/**
 * Created by lpl on 2018/6/26.
 */
public class Person_6 {
    private String name;
    private int age;

    public Person_6() {
        System.out.println("父类中的构造方法");
    }

    public Person_6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void print(){
        System.out.println("Person -- > void print()");
    }

    public void fun(){
        this.print();
    }
}
