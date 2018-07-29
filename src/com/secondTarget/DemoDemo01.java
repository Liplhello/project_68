package com.secondTarget;

import com.firstKind.Demo01;

/**
 * Created by lpl on 2018/6/20.
 */
public class DemoDemo01 {
    public static void main(String[] args) {
        System.out.println(new Demo01().getName());
        System.out.println(new Demo01("XHN").getName());
        System.out.println(new Demo01().getName());
        System.out.println(new Demo01("HKH").getName());
    }
}
