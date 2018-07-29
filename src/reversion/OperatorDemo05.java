package reversion;

/**
 * Created by lpl on 2018/6/5.
 */
public class OperatorDemo05 {
    public static void main(String[] args) {
        if(5 > 2){
            System.out.println("5>2,条件成立");
        }
        if(true){
            System.out.println("直接写的true");
        }
        if((3 + 6) == (3 - 6)){
            System.out.println("这是不可能成立的!");
        }
    }
}
