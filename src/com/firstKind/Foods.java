package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Foods implements InterFaceShop{
    private String name;
    private double pirce;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.pirce;
    }

    public Foods(String name, double pirce) {
        this.name = name;
        this.pirce = pirce;
    }
}
