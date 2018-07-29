package com.secondTarget;

import com.firstKind.A;
import com.firstKind.B1;
import com.firstKind.C1;

/**
 * Created by lpl on 2018/6/30.
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        fun(new B1());
        fun(new C1());
    }

    public static void fun(A a){
        a.fun1();
        if(a instanceof B1){
            B1 b = (B1)a;
            b.fun3();
        }
        if(a instanceof C1){
            C1 c1 = (C1)a;
            c1.fun5();
        }
    }
}
