package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ExercisesDemo4_1 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum += factorialAdd(i);
            if(i<num){
                System.out.print(i + "! + ");
            }else{
                System.out.print(i + "!");
            }
        }
        System.out.println(" = " +sum);
    }

    public static int factorialAdd(int x){
        int factorial = 0;
        if(x == 1){
            factorial = 1;
        }else{
            factorial = x * factorialAdd(x-1);
        }
        return factorial;
    }
}
