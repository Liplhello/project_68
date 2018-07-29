package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_3 {
    public static void main(String[] args) {
        int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int newArr[] = delZero(oldArr);
        print(newArr);
    }

    public static int zeroNum(int x[]){
        int num =0;
        for(int i :x){
            if(i != 0){
                num++;
            }
        }
        return num;
    }

    public static int[] delZero(int x[]){
        int temp[] = new int[zeroNum(x)];
        int j = 0;
        for(int i=0;i<x.length;i++){
            if(x[i] != 0){
                temp[j] = x[i];
                j++;
            }
        }
        return temp;
    }

    public static void print(int x[]){
        for(int i :x){
            System.out.println(i);
        }
    }
}
