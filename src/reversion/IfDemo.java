package reversion;

/**
 * Created by lpl on 2018/6/11.
 */
public class IfDemo {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println("===========比较开始============");
        if(x > y){
            System.out.println("x比y大");
        }
        if(x < y){
            System.out.println("x比y小");
        }
        System.out.println("===========比较结束============");
    }
}
