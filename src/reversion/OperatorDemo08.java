package reversion;

/**
 * Created by lpl on 2018/6/6.
 */
public class OperatorDemo08 {
    public static void main(String[] args) {
        int score = 50;
        if((score < 0) || (score>100)){
            System.out.println("输入的成绩有误!");
        }
        if((score < 60) && (score > 49)){
            System.out.println("不及格,准备补考吧!");
        }
    }
}
