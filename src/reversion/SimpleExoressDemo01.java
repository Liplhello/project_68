package reversion;

/**
 * Created by lpl on 2018/6/11.
 */
public class SimpleExoressDemo01 {
    public static void main(String[] args) {
        int a = 3, b =5;
        System.out.println("改变之前的数: a = " + a + ", b = " + b);
        a += b;
        System.out.println("改变之后的输: a = " + a + ", b = " + b);
        a -= b++;
        System.out.println("a-=b++之后的输: a = " + a + ", b = " + b);
    }
}
