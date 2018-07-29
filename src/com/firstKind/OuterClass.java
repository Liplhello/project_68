package com.firstKind;

/**
 * Created by lpl on 2018/6/20.
 */
public class OuterClass {
    private static String info = "HAHAHAHAHAHA~~~";

//    public class InnerClass{
//        public void print(){
//            System.out.println("Hello,world!");
//            System.out.println(info);
//        }
//    }

//    public void fun(){
//        new InnerClass().print();
//    }

    //方法中定义内部类
    public void fun(final int temp){ //final不加也没报错?
        class InnerClass{
            public void print(){
                System.out.println("类中的属性:" + info);
                System.out.println("方法中的参数:" + temp);
            }
        }
        new InnerClass().print();
    }

}
