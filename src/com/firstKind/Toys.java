package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Toys implements InterFaceShop {
    private String name;
    private double pirce;
    @Override
    public double getPrice() {
        return this.pirce;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Toys(String name, double pirce) {
        this.name = name;
        this.pirce = pirce;
    }
}
