package com.secondTarget;

import com.firstKind.ReverseArray;
import com.firstKind.SortArray;

/**
 * Created by lpl on 2018/6/28.
 */
public class ArrayDemo6_1 {
    public static void main(String[] args) {
        ReverseArray arr = new ReverseArray(5);
        System.out.println(arr.add(3));
        System.out.println(arr.add(7));
        System.out.println(arr.add(6));
        System.out.println(arr.add(3));
        System.out.println(arr.add(8));
        System.out.println(arr.add(1));

        System.out.println("arr的值:");
        print(arr.getArray());
        System.out.print("arr反转后:");
        print(arr.reverseArr());

        SortArray arr2 = new SortArray(7);
        arr2.add(8);
        arr2.add(3);
        arr2.add(5);
        arr2.add(2);
        arr2.add(11);
        arr2.add(9);
        arr2.add(6);
        arr2.add(13);

        System.out.println("arr2的值:");
        print(arr2.getArray());
        System.out.print("arr2排序后的值:");
        print(arr2.sortArr());
    }

    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
