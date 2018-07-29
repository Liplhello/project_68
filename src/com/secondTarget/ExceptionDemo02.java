package com.secondTarget;

/**
 * Created by lpl on 2018/7/10.
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        try {
            throw new Exception("自己抛出的异常!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
