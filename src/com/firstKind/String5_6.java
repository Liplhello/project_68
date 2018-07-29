package com.firstKind;

/**
 * Created by lpl on 2018/6/25.
 */
public class String5_6 {
    public static void main(String[] args) {
        String str = "Java技术学习班20070326";
        String str1 = "MLDN JAVA";
        String str2 = "Java技术学习班20070326 MLDN 老师";
        String userCard = "110110154011113452";

        System.out.println(str.substring(str.length()-8));
        System.out.println(str1.replaceAll("JAVA", "J2EE"));
        System.out.println(str.charAt(8 - 1));
        System.out.println(str.replace("0", ""));
        System.out.println(str2.replace(" ",""));
        System.out.println(userCard.substring(userCard.length()-12,userCard.length()-4));
    }
}
