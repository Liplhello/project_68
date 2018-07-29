package com.firstKind;

/**
 * Created by lpl on 2018/6/22.
 */
public class CountNum {
    private String string;
    private char letter;

    public CountNum() {
    }

    public CountNum(String string, char letter) {
        this.string = string;
        this.letter = letter;
    }

    public String getString() {
        return string;
    }

    public char getLetter() {
        return letter;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void countCharNum(){
        int count = 0;
        if(this.string != null){
            char ch[] = this.string.toCharArray();
            for(char i : ch){
                if(i == this.letter){
                    count ++;
                }
            }
            System.out.println("字符串\"" + this.string + "\"中:");
            System.out.println(this.letter + "出现的次数为 " + count);
        }else{
            System.out.println("字符串为null");
        }
    }
}
