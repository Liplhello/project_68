package com.firstKind;

/**
 * Created by lpl on 2018/7/5.
 */
public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名:" + this.name + ",年龄:" + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }else{
            Person per = (Person)obj;
            if(per.name.equals(this.name)&&per.age == this.age){
                return true;
            }else{
                return false;
            }
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
