package com.firstKind;

/**
 * Created by lpl on 2018/6/19.
 */
public class Person02 {
    private String name;
    private static  int age;
//    private int age;

    public Person02() {
        System.out.println("一个对象被实例化");
    }

    public Person02(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public boolean compare(Person02 per){
        Person02 p1 = this;
        Person02 p2 = per;
        if(p1==p2){
            return true;
        }
        if(p1.getAge()==p2.getAge()&& p1.getName()==p2.getName()){
            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    public static void setAge(int age) {
        Person02.age = age;
    }

    public static int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
