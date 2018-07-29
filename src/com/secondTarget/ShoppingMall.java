package com.secondTarget;

import com.firstKind.Foods;
import com.firstKind.ShopTotal;
import com.firstKind.Toys;

/**
 * Created by lpl on 2018/7/9.
 */
public class ShoppingMall {
    public static void main(String[] args) {
        ShopTotal sh = new ShopTotal();
        sh.add(new Toys("手枪",34.6));
        sh.add(new Toys("飞机",84.3));
        sh.add(new Toys("白T",60));
        sh.add(new Foods("特伦舒（箱）",73.5));
        sh.add(new Foods("乐事薯片",8.5));
        sh.add(new Foods("牛仔裤",120));
        System.out.println("共购买:" + sh.getNumber() + "件商品,合计:"
                + String.format("%.2f",sh.totalMoney()) + "元。");
    }
}
