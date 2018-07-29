package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class Demo01 {
    private static int count;
    private String name;

    public Demo01() {
        count++;
        this.name = "DEMO-" + count;
    }

    public Demo01(String name) {
        this.name = name;
    }

    public static void setCount(int count) {
        Demo01.count = count;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
}
