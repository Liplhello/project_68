package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Square6_5 extends Shape{
    private int wid;

    public Square6_5(int wid) {
        this.wid = wid;
    }

    @Override
    public float perimeter() {
        return wid*wid;
    }

    @Override
    public float area() {
        return wid*4;
    }
}
