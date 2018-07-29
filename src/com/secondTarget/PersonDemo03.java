package com.secondTarget;

import com.firstKind.Person02;

/**
 * Created by lpl on 2018/6/19.
 */
public class PersonDemo03 {
    public static void main(String[] args) {
        Person02 per = new Person02("ella",38);
        Person02 per1 = new Person02("ellaa",37);
        Person02 per2 = new Person02("hshsh",88);
        Person02.setAge(23);

//        if(per.compare(per1)){
//            System.out.println("两个对象相同!");
//        }else{
//            System.out.println("两个对象不同");
//        }

        System.out.println(per.getAge() + "  " + per1.getAge());
    }
}
