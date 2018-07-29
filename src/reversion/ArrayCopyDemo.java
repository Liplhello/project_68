package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int arr1[] = {3,5,7,8,9,4,5,3};
        int arr2[] = {43,56,32,46,78,64,54,26,78};
        copy(arr1,1,arr2,5,3);
//        System.arraycopy(arr1,3,arr2,3,4);
        print(arr2);
    }

    public static void copy(int arr1[],int a1,int arr2[],int a2,int len){
        for(int i =0;i<len;i++){
            arr2[a2+i] = arr1[a1+i];
        }
    }

    public static void print(int x[]){
//        for(int i=0;i<x.length;i++){
        for(int i : x){
            System.out.print(i+"、");
        }
    }
}
