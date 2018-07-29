package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercisesDemo06 {
    public static void main(String[] args) {
        int x = 13;
        int sum = 0;
        for(int i = 0;i<100;i++){
            if(x/10%2==1){
                System.out.print(x);
                sum += x;
                x += 10;
            }else{
                System.out.print("-" + x + "+");
                sum -= x;
                x +=10;
            }
        }
        System.out.println("\n" + sum);
    }
}
