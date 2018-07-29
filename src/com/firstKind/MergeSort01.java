package com.firstKind;

/**
 * Created by lpl on 2018/7/25.
 */
public class MergeSort01 {
    public static void main(String[] args) {
        int a[] = {4,2,5,6,8,3,5,2,11,9,1,23,15,11};
        print(sort(a,0,a.length-1));
    }

    public static int[] sort(int a[],int low,int high){
        if(low>=high){
            return a;
        }
        int mid = (low+high)/2;
        sort(a,low,mid);
        sort(a, mid+1, high);
        merge(a, low, mid, high);
        return a;
    }
//    升序归并
    public static void merge(int[] a,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int[] temp = new int[high-low+1];
        int k = 0;
        while(i<=mid&&j<=high){
            if(a[i]<=a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        for(int x=0;x<temp.length;x++){
            a[low+x] = temp[x];
        }
    }

    public static void  print(int a[]) {
        for(int i : a){
            System.out.print(i + ",");;
        }
        System.out.println();
    }
}
