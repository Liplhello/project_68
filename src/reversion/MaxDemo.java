package reversion;

/**
 * Created by lpl on 2018/6/11.
 */
public class MaxDemo {
    public static void main(String[] args) {
        int max = 0;
        int x = 3, y =4;
        max = x > y ? x : y;
        System.out.println("最大值为: " + max);
    }
}
