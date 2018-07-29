package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class Operate {
    private String info[];

    public Operate(String[] info) {
        this.info = info;
    }

//    public String login(){
//        Check check = new Check();
//        check.isExit(this.info);
//
//        String name = this.info[0];
//        String password = this.info[1];
//
//        String str = null;
//        if(check.validate(name,password)){
//            str = "欢迎" + name + "光临!";
//        }else{
//            str = "用户名或密码有误";
//        }
//        return str;
//    }

    public String login(){
        Check check = new Check();
        this.isExit();

        String name = this.info[0];
        String password = this.info[1];

        String str = null;
        if(check.validate(name,password)){
            str = "欢迎" + name + "光临!";
        }else{
            str = "用户名或密码有误";
        }
        return str;
    }

    public void isExit(){
        if(this.info.length!=2){
            System.out.println("输入的参数不正确,系统退出!");
            System.out.println("格式:java LoginDemo02 用户名 密码");
            System.exit(1);
        }
    }

//    public boolean validate(String name,String password){
//        if(name.equals("lpl")&&password.equals("lpllpl")){
//            return true;
//        }else{
//            return false;
//        }
//    }
}
