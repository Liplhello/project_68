package com.secondTarget;

import com.firstKind.Demo02;

/**
 * Created by lpl on 2018/6/20.
 */
public class DemoDemo02 {
    static{
        System.out.println("主方法所在类定义静态代码块");
    }
    public static void main(String[] args) {
        new Demo02();
        new Demo02();
        new Demo02();
    }
}
