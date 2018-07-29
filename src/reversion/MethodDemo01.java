package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class MethodDemo01 {
    public static void main(String[] args) {
//        printInfo();
//        printInfo();
//        printInfo();
//        System.out.println("Hello,world!");
        int sum1 = addOne(10,20);
        float sum2 = addTwo(10.3f,8.9f);
        int sum3 = addOne(10, 20, 30);
        System.out.println("addOne的值为:" + sum1);
        System.out.println("addTwo的值为:" + sum2);
        System.out.println("addOne的值为:" + sum3);
    }

    public static void printInfo(){
        char a[] = {'H','e','l','l','o',',','l','p','l'};
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static int addOne(int x ,int y){
        int sum = x + y;
        return  sum;
    }

    public static float addTwo(float x,float y){
        float sum = x + y;
        return sum;
    }

    public static int addOne(int x,int y,int z){
        int sum = x + y + z;
        return sum;
    }
}
