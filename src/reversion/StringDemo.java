package reversion;

/**
 * Created by lpl on 2018/6/5.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "lpl";
        int x = 3;
        str = str + 3;
        System.out.println("str = " + str);
        int i = 1;
        int j = 3;
        System.out.println("1 + 3 = " + i + j);
        System.out.println("1 + 3 = " + (i + j));
    }
}
