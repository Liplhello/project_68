package com.secondTarget;

/**
 * Created by lpl on 2018/7/10.
 */
public class Excepptiondemo01 {
    public static void main(String[] args) {
//        System.out.println("***********计算开始***********");
//        int i=0;
//        int j=0;
//        try{
//            String str1 = args[0];
//            String str2 = args[1];
//            i = Integer.parseInt(str1);
//            j = Integer.parseInt(str2);
//            int temp = i/j;
//            System.out.println("两个数字相除结果:" + temp);
//            System.out.println("------------------------------");
//        }catch(ArithmeticException e){
//            System.out.println("出现异常了: " + e);
//        }catch(Exception e){
//            System.out.println("出现异常了: " + e);
//        }
//        System.out.println("************计算结束**************");
        try {
            div(5,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int div(int i ,int j ) throws Exception{
        int temp = i/j;
        return temp;
    }
}
