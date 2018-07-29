package com.firstKind;

/**
 * Created by lpl on 2018/7/11.
 */
public class Math {
    public int div(int i , int j) throws Exception{
        System.out.println("*********计算开始************");
        int temp = 0;
        try{
            temp = i/j;
        }catch(Exception e) {
            throw e;
        }finally{
            System.out.println("*************计算结束*************");
        }
        return temp;
    }
}
