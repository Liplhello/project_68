package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class LoginDemo {
    public static void main(String[] args) {

        System.out.println(args.length);

        if(args.length != 2){
            System.out.println("输入的参数不正确,系统退出!");
            System.out.println("格式: java LoginDemo 用户名 密码");
            System.exit(1);
        }

        String name = args[0];
        String password = args[1];

        for(String i : args){
            System.out.print(i + "、");
        }

        if(name.equals("lpl") && password.equals("lpllpl")){
            System.out.println("\n欢迎" + name + "登录");
        }else{
            System.out.println("用户名或密码有误!");
        }

    }
}
