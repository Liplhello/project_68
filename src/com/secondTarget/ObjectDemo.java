package com.secondTarget;

import com.firstKind.Person;

/**
 * Created by lpl on 2018/7/5.
 */
public class ObjectDemo {
    public static void main(String[] args) {
//        Person per = new Person(26,"lee");
//        System.out.println("对象信息 --> " + per);
        Person per1 = new Person(26,"lee");
        Person per2 = new Person(22,"susan");
        Person per3 = new Person(26,"lee");
        System.out.println(per1.equals(per2) ? "是同一个人!" : "不是同一个人!");
        System.out.println(per1.equals(per3) ? "是同一个人!" : "不是同一个人!");
        System.out.println(per1.equals("hello") ? "是同一个人" : "不是同一个人!");
    }
}
