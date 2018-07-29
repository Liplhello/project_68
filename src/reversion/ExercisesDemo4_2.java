package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_2 {
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,8,34,52,47,61,98,93,46,48};
        int oddNum = 0;
        int eveNum = 0;
        for(int i : arr){
            if(i%2==0){
                eveNum++;
            }else{
                oddNum++;
            }
        }
        System.out.println("数组中奇数的个数为:" + oddNum);
        System.out.println("数组中偶数的个数为:" + eveNum);
    }
}
