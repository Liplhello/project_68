package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public class ReverseArray extends ArrayDemo {

    public ReverseArray(int len) {
        super(len);
    }

    public int [] reverseArr(){
        int rever[] = this.getTemp();
        int rev = rever.length/2;
        for(int i =0;i<rev;i++){
            int num = rever[i];
            rever[i] = rever[rever.length-1-i];
            rever[rever.length-1-i] = num;
        }
        return rever;
    }
}
