package com.secondTarget;

import com.firstKind.InfoA;

/**
 * Created by lpl on 2018/6/30.
 */
public class InrterfaceDemo {
    public static void main(String[] args) {
        InfoA info = new InfoA();
        info.say();
        info.print();
        System.out.println(info.getInfo());
    }
}
