package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class StaticDemo {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("输入参数的个数不足3个,程序退出");
            System.exit(1);
        }
        for(int i=0;i<args.length;i++){
            System.out.println("第" + (i+1) + "个参数:" + args[i]);
        }
    }

}
