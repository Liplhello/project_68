package reversion;

/**
 * Created by lpl on 2018/6/11.
 */
public class WhileDemo {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;

//        while(x <= 10){
//            sum += x;
//            x++;
//        }

        do{
            sum += x;
            x++;
        }while(x <= 10);

        System.out.println("1~10累加结果为: " + sum);
    }
}
