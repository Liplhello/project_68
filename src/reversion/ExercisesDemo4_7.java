package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_7 {
    public static void main(String[] args) {
        int score[] = {89,93,91,95,97,99,96,93,97,99};
        int temp = score[0];
        for(int i =1;i<score.length;i++){
            if(temp < score[i]){
                temp = score[i];
            }
        }
        System.out.println("10位老师中最高分为:" + temp);
    }
}
