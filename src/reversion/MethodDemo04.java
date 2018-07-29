package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class MethodDemo04 {
    public static void main(String[] args) {
        System.out.println("1~100累加: " + sum(100));
    }

    public static int sum(int x){
        if(x == 1){
            return 1;
        }else{
            return x + sum((x-1));
        }
    }
}
