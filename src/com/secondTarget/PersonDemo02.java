package com.secondTarget;

import com.firstKind.Person01;

/**
 * Created by lpl on 2018/6/19.
 */
public class PersonDemo02 {
    public static void main(String[] args) {
        System.out.println("声明对象Person01 per = null");
        Person01 per = null;  //声明对象不调用构造方法
        System.out.println("实例化对象per = new Person01()");
        per = new Person01("李四",-30);  //实例化调用构造方法
        per.tell();
        Person01 per1 = new Person01("张三");
        per1.tell();
        new Person01("王五",28).tell();
    }
}
