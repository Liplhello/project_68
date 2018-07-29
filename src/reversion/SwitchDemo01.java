package reversion;

/**
 * Created by lpl on 2018/6/11.
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        int a = 3, b = 4;
        char con = '$';
        switch(con){
            case '+' : {
                System.out.println("a + b = " + (a+b));
                break;
            }
            case '-' : {
                System.out.println("a - b = " + (a-b));
                break;
            }
            case '*' : {
                System.out.println("a * b = " + (a*b));
                break;
            }
            case '/' : {
                System.out.println("a / b = " + (a/b));
                break;
            }
            default : {
                System.out.println("未知的操作!");
                break;
            }
        }
    }
}
