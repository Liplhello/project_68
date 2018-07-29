package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class Demo02 {
    {
        System.out.println("1、构造块");
    }

    static{
        System.out.println("0、静态代码块");
    }
    public Demo02() {
        System.out.println("2、构造方法");
    }
}
