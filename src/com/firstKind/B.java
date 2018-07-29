package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public class B extends AbstractClass {
    @Override
    public void print() {
        System.out.println("FLAG = " + FLAG);
        System.out.println("姓名 = " + super.getName());
    }
}
