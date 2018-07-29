package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class ShopTotal {
    private int foot;
    private InterFaceShop[] shop;
    static int len = 5;
    private double total;

    public ShopTotal() {
        this.shop = new InterFaceShop[len];
    }

    public void add(InterFaceShop good){
        if(this.foot >= this.shop.length){
            InterFaceShop[] shops = new InterFaceShop[this.shop.length+len];
            System.arraycopy(this.shop,0,shops,0,this.shop.length);
            this.shop = shops;
        }
        this.shop[this.foot] = good;
        foot++;
    }

    public double totalMoney(){
        for(int i = 0;i<this.foot;i++){
            this.total += shop[i].getPrice();
        }
        return this.total;
    }

    public int getNumber(){
        return this.foot;
    }
}
