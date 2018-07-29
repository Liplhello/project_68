package reversion;

/**
 * Created by lpl on 2018/6/14.
 */
public class ExercisesDemo4_10 {
    public static void main(String[] args) {
        int num[] = {1,4,5,6,7,7,8,8,9,14,17};
        int arr[] = new int[num.length+1];
        int num1 = 8;
        int index = 0;
        for(int i =0;i<num.length-1;i++){
            if(num1>=num[i] && num1<=num[i+1]){
                arr[i] = num[i];
                arr[i+1] = num1;
                index = i+1;
                break;
            }else{
                arr[i] = num[i];
            }
        }
        for(int j=index;j<num.length;j++){
            arr[j+1] = num[j];
        }
        for(int i : arr){
            System.out.print(i + ",");
        }
    }
}
