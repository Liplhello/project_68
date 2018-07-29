package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ArraySortDemo {
    public static void main(String[] args) {
        int score[] = {89,79,94,87,92,79,78};
        int age[] = {40,36,38,25,17,19,20};

//        arrSort(score);
        java.util.Arrays.sort(score,2,7);
        print(score);
        System.out.println("=====================");
        arrSort(age);
        print(age);
    }

    public static int[] arrSort(int x[]){
        int temp[] = x;
        for(int i =1;i<x.length;i++){
            for(int j = 0;j<x.length-i;j++){
                if(x[j]>x[j+1]){
                    int temp1 = x[j+1];
                    x[j+1] = x[j];
                    x[j] = temp1;
                }
            }
        }
        return temp;
    }

    public static void print(int x[]){
        for(int i =0;i<x.length;i++){
            System.out.print(x[i] + "、");
        }
        System.out.println();
    }
}
