package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class WrapperDemo {
    public static void main(String[] args) {
//        int x = 30;
//        Integer i = new Integer(x);  //装箱
//        int temp = i.intValue();  //拆箱
//
//        float f = 30.3f;
//        Float ff = new Float(f);
//        float fff = ff.floatValue();

//        自动装箱、拆箱
//        Integer i = 30;
//        Float f = 30.3f;
//        int x = i;
//        float y = f;

        String str1 = "30";
        String str2 = "30.3";
        int x = Integer.parseInt(str1);
        float f = Float.parseFloat(str2);
        System.out.println(x*x);
        System.out.println(f*f);
    }
}
