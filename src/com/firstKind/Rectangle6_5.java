package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Rectangle6_5 extends Shape {
    private float wid;
    private float len;

    public Rectangle6_5(float len, float wid) {
        this.len = len;
        this.wid = wid;
    }

    @Override
    public float area() {
        return wid * len;
    }

    @Override
    public float perimeter() {
        return (wid + len) * 2;
    }
}
