package com.secondTarget;

import com.firstKind.Person01;

/**
 * Created by lpl on 2018/6/20.
 */
public class ObjectArray {
    public static void main(String[] args) {
//        Person01 per[] = new Person01[3];
        Person01 per[] = {new Person01("asd"),new Person01("QWE"),new Person01("ifj")};
        System.out.println("===============数组声明===============");

        for(Person01 i : per){
            System.out.print(i + "、");
        }

//        per[0] = new Person01("qas");
//        per[1] = new Person01("asd");
//        per[2] = new Person01("zxc");

        System.out.println("\n ===========对象实例化==============");
        for(Person01 i : per){
            System.out.print(i.getName() + "、");
        }
    }
}
