package reversion;

/**
 * Created by lpl on 2018/6/12.
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int score [] = null;
        score = new int[3];

        for(int x = 0;x<3;x++){
            score[x] = x*2 + 1;
        }

//        System.out.println("score[0] = " + score[0]);
//        System.out.println("score[1] = " + score[1]);
//        System.out.println("score[2] = " + score[2]);
//
        for(int x = 0;x<3;x++){
            System.out.println("score[" + x + "] = " + score[x]);
        }
        System.out.println("数组长度为:" + score.length);
    }
}
