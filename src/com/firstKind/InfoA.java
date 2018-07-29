package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public class InfoA implements InterfaceA,InterfaceB{
    @Override
    public String getInfo() {
        return "Hello";
    }

    @Override
    public void print() {
        System.out.println("作者: " + AUTHOR);
    }

    @Override
    public void say() {
        System.out.println("Hello World !!!");
    }
}
