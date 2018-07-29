package com.secondTarget;

import com.firstKind.Student6_3;

/**
 * Created by lpl on 2018/7/9.
 */
public class Person6_3Demo {
    public static void main(String[] args) {
        Student6_3 stu = new Student6_3("昌平",22,"lee",'男',89.5f,90f);
        System.out.println(stu.toString());
        Student6_3 stu1 = new Student6_3("suran",27);
        System.out.println(stu1.toString());
    }
}
