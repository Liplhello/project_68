package com.firstKind;

/**
 * Created by lpl on 2018/7/25.
 */
public class QuickSort01 {
    public static void main(String[] args) {
        int a[] = {4,2,5,6,8,3,5,2,11,9,1,23,15,11};
        print(quick(a, 0, a.length - 1));
    }
//    升序快排
    public static int[] quick(int a[],int low,int high){
        int i = low;
        int j = high;
        if(i>=j){
            return a;
        }
        int index = a[i];
        while(i<j){
            while(i<j&&a[j]>index){
                j--;
            }
            if(i<j){
                a[i++] = a[j];
            }
            while(i<j&&a[i]<index){
                i++;
            }
            if(i<j){
                a[j--] = a[i];
            }
        }
        a[i] = index;
        quick(a,low,i-1);
        quick(a,i+1,high);
        return a;
    }

    public static void  print(int a[]) {
        for(int i : a){
            System.out.print(i + ",");;
        }
        System.out.println();
    }
}
