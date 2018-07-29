package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public class A {
    public void fun1(){
        System.out.println("A-->fun1()");
    }

    public void fun2(){
        this.fun1();
    }
}
