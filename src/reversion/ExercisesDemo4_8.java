package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_8 {
    public static void main(String[] args) {
        int num[] = {1,3,4,5,7,8,9,0,2,3,4,3,4,5,7,8,0,1,2,3,6,7,9,8,5,3,2,1,4,5};
        for(int i =0;i<=9;i++){
            int count = 0;
            for(int j =0;j<num.length;j++){
                if(i == num[j]){
                    count ++;
                }
            }
            System.out.println("数组中" + i + "出现 " + count + " 次");
        }
    }
}
