package com.firstKind;

/**
 * Created by lpl on 2018/7/23.
 */
public class ExceptionDemo {
    public static void main(String[] args){
        int result = 0;
        try {
            int d0 = Integer.parseInt(args[0]);
            int d1 = Integer.parseInt(args[1]);
            result = d0 / d1;
        }
        catch (ArithmeticException e) {
            System.out.println("除数不能为零!" + e);
        }
        catch (NumberFormatException e) {
            System.out.println("请输入两个小数!" + e);
        }
        finally {
            System.out.println(result);
        }
// 运行结果:java 3.3 0输出:除数不能为零!java safl iasia输出:请输入两个小数!java 3.5 0.7输出:5.0

    }
}
