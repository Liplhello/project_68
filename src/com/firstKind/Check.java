package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class Check {

    public boolean validate(String name,String password){
        if(name.equals("lpl")&&password.equals("lpllpl")){
            return true;
        }else{
            return false;
        }
    }

//    public void isExit(String info[]){
//        if(info.length!=2){
//            System.out.println("输入的参数不正确,系统退出!");
//            System.out.println("格式:java LoginDemo02 用户名 密码");
//            System.exit(1);
//        }
//    }
}
