package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class MethodDemo02 {
    public static void main(String[] args) {
        int sum1 = add(10,20);
        float sum2 = add(10.3f,8.9f);
        int sum3 = add(10, 20, 30);
        System.out.println("add的值为:" + sum1);
        System.out.println("add的值为:" + sum2);
        System.out.println("add的值为:" + sum3);
    }

    public static void printInfo(){
        char a[] = {'H','e','l','l','o',',','l','p','l'};
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static int add(int x ,int y){
        int sum = x + y;
        return  sum;
    }

    public static float add(float x,float y){
        float sum = x + y;
        return sum;
    }

    public static int add(int x,int y,int z) {
        int sum = x + y + z;
        return sum;
    }
}
