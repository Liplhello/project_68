package com.secondTarget;

import com.firstKind.SingDemo;

/**
 * Created by lpl on 2018/6/20.
 */
public class TMain {
    public static void main(String[] args){
        SingDemo ts1 = SingDemo.getInstance();
        ts1.setName("jason");
        SingDemo ts2 = SingDemo.getInstance();
        ts2.setName("0539");

        ts1.printInfo();
        ts2.printInfo();

        if(ts1 == ts2){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }
    }
}
