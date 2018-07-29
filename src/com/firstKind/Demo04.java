package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class Demo04 {

    static Demo04 demo = new Demo04();

    private Demo04() {
    }

    public static void setDemo(Demo04 demo) {
        Demo04.demo = demo;
    }

    public static Demo04 getDemo() {

        return demo;
    }

    public void print(){
        System.out.println("Hello");
    }
}
