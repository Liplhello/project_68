package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public class SortArray extends ArrayDemo{

    public SortArray(int len) {
        super(len);
    }

    public int [] sortArr(){
        int sor[] = this.getTemp();
        if(sor.length!=1){
            for(int i=0;i<sor.length;i++){
                for(int j=1;j<sor.length-i;j++){
                    if(sor[j-1] > sor[j]){
                        int num = sor[j-1];
                        sor[j-1] = sor[j];
                        sor[j] = num;
                    }
                }
            }
        }
        return sor;
    }
}
