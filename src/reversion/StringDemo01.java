package reversion;

/**
 * Created by lpl on 2018/6/19.
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2;
        String str4[] = str3.split("l");

        System.out.println("str1 == str2 : " + (str1==str2));
        System.out.println("str1 == str3 : " + (str1==str3));
        System.out.println("str2 == str3 : " + (str2==str3));
        for(int i =0;i<str4.length;i++){
            System.out.println("str4[" + i + "] = " + str4[i]);
        }
        System.out.println();
        System.out.println(str4.length);
    }
}
