package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Graph {
    private int grow;
    private int wide;

    public Graph(int grow, int wide) {
        this.grow = grow;
        this.wide = wide;
    }

    public void area(){
        System.out.println("面积为:" + this.wide * this.grow);
    }

    public void permeter(){
        System.out.println("周长为:" + (this.wide * this.grow)*2);
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getGrow() {
        return grow;
    }

    public void setGrow(int grow) {
        this.grow = grow;
    }
}
