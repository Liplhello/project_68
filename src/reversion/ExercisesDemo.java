package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercisesDemo {
    public static void main(String[] args) {
        // 1!+2!+...+20!
        int sum = 0;
        for(int i = 1; i <= 20; i++){
            int temp = 1;
            for(int j = 1;j <= i;j++){
                temp *= j;
            }
            sum += temp;
        }
        System.out.println("1!+2!+...+20! = " + sum);
    }
}
