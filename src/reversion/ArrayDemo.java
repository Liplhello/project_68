package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int score[][] = {{78,92,85},{89},{98,96,99,95}};
        for(int i =0;i<score.length;i++){
            for(int j =0;j<score[i].length;j++){
                System.out.print(score[i][j]+"\t");
            }
            System.out.println();
        }
;    }
}
