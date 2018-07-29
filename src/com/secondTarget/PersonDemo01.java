package com.secondTarget;

import com.firstKind.Person01;

/**
 * Created by lpl on 2018/6/19.
 */
public class PersonDemo01 {
    public static void main(String[] args) {
        Person01 per1 = new Person01("李四",30);
        per1.setName("张三");
        per1.setAge(-30);
        per1.tell();
    }
}
