package com.secondTarget;

import com.firstKind.Cat;
import com.firstKind.Dog;
import com.firstKind.Pet;
import com.firstKind.PetShop;

/**
 * Created by lpl on 2018/7/5.
 */
public class PetShopDemo {
    public static void main(String[] args) throws Exception{
        try {
            PetShop ps = new PetShop(5);
            System.out.println(ps.add(new Cat("白猫", "白色", 2)));
            System.out.println(ps.add(new Cat("黑猫", "黑色", 2)));
            System.out.println(ps.add(new Cat("花猫", "花色", 3)));
            System.out.println(ps.add(new Dog("金毛", "金色", 3)));
            System.out.println(ps.add(new Dog("萨摩", "白色", 1)));
            System.out.println(ps.add(new Dog("泰迪", "棕色", 3)));

            print(ps.search("蓝"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void print(Pet[] p){
        for(int i= 0;i< p.length; i++){
            if(p[i]!=null){
                System.out.println(p[i].getName()+","
                        + p[i].getColor() + ","
                        + p[i].getAge());
            }
        }
    }
}
