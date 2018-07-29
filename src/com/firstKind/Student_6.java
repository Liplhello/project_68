package com.firstKind;

/**
 * Created by lpl on 2018/6/26.
 */
public class Student_6 extends Person_6{

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student_6() {
        System.out.println("子类中的构造方法");
    }

    void print(){
        System.out.println("Student -- > void print()");
    }
}
