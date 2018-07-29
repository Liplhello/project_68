package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class MethodDemo03 {
    public static void main(String[] args) {
        System.out.println("1.调用方法之前");
        fun(10);
        System.out.println("2.调用方法之后");
    }
    public static void fun(int x){
        System.out.println("3。进入fun方法");
        if(x == 10){
            return;
        }
        System.out.println("4、执行方法");
    }
}
