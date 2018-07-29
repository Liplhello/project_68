package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_4 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,0,0,6,6,9,5,4,7,6,7,0,5};
        System.out.println("数组内值的和: " + sumNum(arr));
        System.out.println("数组内值的最大值: " + maxNun(arr));
        System.out.println("数组内值的最小值: " + minNum(arr));
    }

    public static int sumNum(int x[]){
        int sum = 0;
        for(int i : x){
            sum += i;
        }
        return sum;
    }

    public static int maxNun(int x[]){
        int temp = x[0];
        for(int i = 1;i<x.length-1;i++){
            if(x[i]>temp){
                temp = x[i];
            }
        }
        return temp;
    }

    public static int minNum(int x[]){
        int temp = x[0];
        for(int i = 1;i<x.length-1;i++){
            if(x[i]<temp){
                temp = x[i];
            }
        }
        return temp;
    }
}
