package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ExercisesDemo04 {
    public static void main(String[] args) {
//        int x = 345;
//        if(x%3==0&&x%5==0&&x%7==0){
//            System.out.println(x + "能被3、5、7同时整除!");
//        }else{
//            System.out.println(x + "不能被3、5、7同时整除!");
//        }
        System.out.println("1~1000满足同时被3、5、7同时整除的数有:");
        for(int i = 1;i<=1000;i++){
            if(i%3==0 && i%5==0 && i%7==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
