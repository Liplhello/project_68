package reversion;

/**
 * Created by lpl on 2018/6/13.
 */
public class ArrayMaoPao {
    public static void main(String[] args) {
        int score [] = {79,69,84,89,95,78,96};

//        for(int i =1;i<score.length;i++){
//            冒泡排序-由大到小
//            for(int j = 0;j<score.length;j++){
//                if(score[i]>score[j]){
//                    int temp = score[j];
//                    score[j] = score[i];
//                    score[i] = temp;
//                }
//            }
//            冒泡排序-由小到大
//            for(int j = 0;j<score.length;j++){
//                if(score[i]<score[j]){
//                    int temp = score[j];
//                    score[j] = score[i];
//                    score[i] = temp;
//                }
//            }

//            for(int j = i-1;j<score.length;j++){
//                if(score[i-1]<score[j]){
//                    int temp = score[j];
//                    score[j] = score[i-1];
//                    score[i-1] = temp;
//                }
//            }
//            System.out.println("输出第" + i + "次,排序结果:");
//            for (int k =0;k<score.length;k++){
//                System.out.println("score[" + k+ "] = " + score[k] + "\t");
//            }
//        }
//        冒泡排序,相邻比较
        for(int i=1;i<score.length;i++){
            for(int j=0;j<(score.length-i);j++){
                if(score[j]<score[j+1]){
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                }
            }
        }
        for(int k =0;k<score.length;k++){
            System.out.println("score[" + k+ "] = " + score[k]);
        }
    }
}
