package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ForNestedDemo {
    public static void main(String[] args) {
        for(int i = 1; i <10 ; i++){
            for(int j = 1;j <= i; j++){
                System.out.printf(i + " * " + j + " = " + (i*j) + " \t");
            }
            System.out.println();
        }
    }
}
