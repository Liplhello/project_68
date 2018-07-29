package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercisesDemo07 {
    public static void main(String[] args) {
        int lay = 7;
        for(int i = 1;i<=lay;i++){
            for(int k = (lay-i);k>=0;k--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
