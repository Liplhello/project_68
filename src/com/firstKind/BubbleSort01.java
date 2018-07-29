package com.firstKind;

/**
 * Created by lpl on 2018/7/25.
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        int a[] = {4,2,5,6,8,3,5,2,3};
        print(sort(a));
    }
//    升序冒泡
    public static int[] sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static void  print(int a[]) {
        for(int i : a){
            System.out.println(i + ",");;
        }
    }
}
