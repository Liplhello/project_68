package reversion;

/**
 * Created by lpl on 2018/6/6.
 */
public class OperatorDemo10 {
    public static void main(String[] args) {
        int x = 3;  //3的二进制数据  00000000 00000000 00000000 00000011
        int y =6;  //6的二进制数据   00000000 00000000 00000000 0000110
        int z = -4;  //-4  4的二进制取反  11111111 11111111 11111111 11111011
                     //再取补码, 反码+1   11111111 11111111 11111111 11111100
                     //负数在内存里是补码  -4 的二进制计算即 4 的二进制补码

        System.out.println("x & y = " + (x & y));
//        System.out.println("x & z = " + (x & z));
        System.out.println("x | y = " + (x | y));
//        System.out.println("x | z = " + (x | z));
        System.out.println("x ^ y = " + (x ^ y));
//        System.out.println("z的反码: " + (~z));
        System.out.println("x 左移2位: " + (x << 2));
        System.out.println("x 右移2位: " + (x >> 2));  //右移正数填0,负数填1
        System.out.println("z 右移2位: " + (z >> 2));
        System.out.println("z 左移2位: " + (z << 2));
        System.out.println("z 无符号右移2位: " + (z >>> 2));  //无符号右移,左侧补0
    }
}