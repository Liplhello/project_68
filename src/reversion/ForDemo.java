package reversion;

/**
 * Created by lpl on 2018/6/11.
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int x = 1; x <= 10; x++){
            sum += x;
        }
        System.out.println("1~10累加的结果是: " + sum);
    }
}
