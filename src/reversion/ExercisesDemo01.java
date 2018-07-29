package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercisesDemo01 {
    public static void main(String[] args) {
        System.out.println("输出所有的3位数的3次幂数-水仙花数:");
        for(int i = 100; i<1000; i++){
            int x = i%10;
            int y = i/10%10;
            int z = i/100;
            int sum = 0;
            sum = x*x*x + y*y*y +z*z*z;
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
