package reversion;

/**
 * Created by lpl on 2018/6/19.
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String str = "shshsffgg";
        char a[] = str.toCharArray();
        byte b[] = str.getBytes();
        String str3 = "       Hello dhfdf  hdfhd  !       ";
        String str4 = "I love YOU!";
        String str5 = "I LOVE YOU!";
        String str1 = new String(a);
        String str2 = new String(a,0,3);
        String str6 = str4.replace(' ','_');
        String str7 = str4.replaceAll("love", "LOVE");

        for(int i =0;i<a.length;i++){
            System.out.print("str[" + i + "] = " + a[i] + "\t");
        }
        System.out.println();

        System.out.println(str1);
        System.out.println(str2);
//        System.out.println(new String(b));
//        System.out.println(str.length());
//        System.out.println(str.indexOf("h"));
//        System.out.println(str.indexOf("h", 3));
//        System.out.println(str.indexOf("l"));
//        System.out.println(str3 + "--" + str3.trim());
//        System.out.println(str4.substring(6));
//        System.out.println(str4.substring(4,8));
//        System.out.println(str3.toUpperCase());
//        System.out.println(str3.toLowerCase());
//        System.out.println(str4.startsWith("I"));
//        System.out.println(str4.endsWith("! "));
//        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str6);
        System.out.println(str7);
    }
}














