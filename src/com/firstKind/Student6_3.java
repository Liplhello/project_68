package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Student6_3 extends Person6_3 {
    private float math;
    private float english;

    public Student6_3(String addr, int age, String name, char sex, float english, float math) {
        super(addr, age, name, sex);
        this.english = english;
        this.math = math;
    }

    public Student6_3(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + ",数学:" + this.math
                + ",英语:" + this.english;
    }
}
