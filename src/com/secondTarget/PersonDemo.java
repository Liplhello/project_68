package com.secondTarget;

import com.firstKind.PersonInfo;

/**
 * Created by lpl on 2018/6/14.
 */
public class PersonDemo {
    public static void main(String[] args) {
        PersonInfo per1 = new PersonInfo();
        PersonInfo per2 = new PersonInfo();
        PersonInfo per3 = per2;
        per1.name = "张三";
        per1.age = 30;
        per2.name = "李四";
        per2.age = 28;
        per3.age = 33;
        System.out.println("pre1中的内容:");
        per1.tell();
        System.out.println("pre2中的内容:");
        per2.tell();
        System.out.println("pre3中的内容:");
        per3.tell();
    }
}
