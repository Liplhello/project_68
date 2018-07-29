package com.firstKind;

/**
 * Created by lpl on 2018/6/28.
 */
public class ArrayDemo {
    private int temp[];
    private int foot;

    public ArrayDemo(int len) {
        if(len>0){
            this.temp = new int[len];
        }else{
            this.temp = new int[1];
        }
    }

    public boolean add(int i){
        if(this.foot < this.temp.length){
            this.temp[foot] = i;
            foot++;
            return true;
        }else{
            return false;
        }
    }

    public int[] getArray(){
        return this.temp;
    }

    public int[] getTemp() {
        return temp;
    }

    public void setTemp(int[] temp) {
        this.temp = temp;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }
}
