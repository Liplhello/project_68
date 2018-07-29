package com.secondTarget;

import com.firstKind.MyException;

/**
 * Created by lpl on 2018/7/11.
 */
public class DefauleException {
    public static void main(String[] args) {
        try{
            throw new MyException("自定义异常。");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
