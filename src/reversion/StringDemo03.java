package reversion;

/**
 * Created by lpl on 2018/6/19.
 */
public class StringDemo03 {
    public static void main(String[] args) {
        String str = "Hello";
        fun(str);
        System.out.println(str);
    }

    public static void fun(String str1){
        str1 = "modol";
    }
}
