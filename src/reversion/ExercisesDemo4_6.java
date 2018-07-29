package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_6 {
    public static void main(String[] args) {
        int arr[] = new int[11];

        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }

        swap(arr);

        for(int i : arr){
            System.out.print(i + ",");
        }
    }

    public static void swap(int x[]){
        for(int i = 0;i<x.length/2;i++){
            int temp = 0;
            temp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = temp;
        }
    }
}

