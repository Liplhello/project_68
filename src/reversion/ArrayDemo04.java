package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int score [][] = new int[3][9];
        score[0][2] = 3;
        score[1][0] = 45;
        score[2][0] = 15;
        score[2][3] = 5;

        for(int i =0;i<score.length;i++){
            for(int j =0;j<score[i].length;j++){
                System.out.print(score[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
