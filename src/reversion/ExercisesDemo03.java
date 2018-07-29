package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercisesDemo03 {
    public static void main(String[] args) {
        int x = 4, y = 7, z = 3;
        int max = 0;
        if(x > y){
            if(x > z){
                max = x;
            }else{
                max = z;
            }
        }else{
            if(y > z){
                max = y;
            }else{
                max = z;
            }
        }
        System.out.println("3个值中最大的数为: " + max);
    }
}
