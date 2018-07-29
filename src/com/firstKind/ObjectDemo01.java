package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class ObjectDemo01 {
    public static void main(String[] args) {
        int temp[] = {1,3,5,7,9};
        Object obj = temp;
        print(obj);
    }

    public static void print(Object o){
        if(o instanceof int[]){
            int x[] = (int[])o;
            System.out.println("数组为:");
            for(int i : x){
                System.out.print(i + ",");
            }
        }
    }
}
