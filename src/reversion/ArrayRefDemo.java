package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ArrayRefDemo {
    public static void main(String[] args) {
//        int temp [] = {1,33,5};
//        fun(temp);
        int arr [] = fun();
        print(arr);
//        for(int i=0;i<temp.length;i++){
//            System.out.println(temp[i]);
//        }
    }

    public static void fun(int x[]){
        x[0] = 6;
    }
    public static int[] fun(){
        int ss[] = {4,6,8,4,2};
        return ss;
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
