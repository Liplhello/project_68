package reversion;

/**
 * Created by lpl on 2018/6/5.
 */
public class OperatorDemo01 {
    public static void main(String[] args) {
        int num = 1;
        int num1 = 5;
        int sum = num + num1;
        System.out.println("sum = " + sum);
        System.out.println("第一次输出num:" + num);
        num = num + 3;
        System.out.println("第二次输出num:" + num);
    }

}
