package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int score [] = {91,89,70,99,87,93};
        int max = 0,min = 0;
        max = min = score[0];
        for(int i = 1;i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            }
            if(score[i]<min){
                min = score[i];
            }
        }
        System.out.println("最高分数是:" + max);
        System.out.println("最低分数是:" + min);
    }
}
