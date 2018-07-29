package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercieseDemo05 {
    public static void main(String[] args) {
        //求100~200的累加和
        int x = 100;
        int sum = 0;

//        for(x=100;x<=200;x++){
//            sum += x;
//        }

//        while(x<=200){
//            sum += x;
//            x++;
//        }

        do{
            sum += x;
            x++;
        }while(x<=200);

        System.out.println("100~200的累加和: " + sum);
    }
}
