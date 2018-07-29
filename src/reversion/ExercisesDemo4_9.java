package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_9 {
    public static void main(String[] args) {
        int arr[] = {12,56,83,46,75,92,35,46,73,88};
        int temp = arr[0];
        for(int j =1;j<arr.length;j++){
            if(temp < arr[j]){
                int num;
                num = temp;
                temp = arr[j];
                arr[j] = num;
            }
        }
        arr[0] = temp;
        for(int i : arr){
            System.out.print(i + ",");
        }
    }
}
