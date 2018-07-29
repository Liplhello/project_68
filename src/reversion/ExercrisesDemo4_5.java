package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercrisesDemo4_5 {
    public static void main(String[] args) {
        int num = 11;
        int arr[] = {1,4,5,7,8,6,5,3,4,23,12,45,66};
        boolean exisit = false;
        for(int i=0;i<arr.length;i++){
            if(!exisit && arr[i] == num){
                System.out.println("该值存在于数组中!");
                exisit = true;
            }
        }
        if(!exisit){
            System.out.println("该值不存在于数组中!");
        }
    }
}
