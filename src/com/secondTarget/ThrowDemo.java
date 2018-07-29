package com.secondTarget;

import com.firstKind.Math;

/**
 * Created by lpl on 2018/7/11.
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Math m = new Math();
        try {
            System.out.println("除法操作:" + m.div(10,0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
