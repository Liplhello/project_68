package com.secondTarget;

import com.firstKind.OuterClass;

/**
 * Created by lpl on 2018/6/20.
 */
public class InnerDemo {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.fun(30);

//        OuterClass.InnerClass in = out.new InnerClass();
//        in.print();

        new OuterClass().fun(30);
    }
}
