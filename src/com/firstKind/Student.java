package com.firstKind;

/**
 * Created by lpl on 2018/6/19.
 */
public class Student {
    private String stuno;
    private String name;
    private float math;
    private float english;
    private float computer;

    public Student(String stuno, String name, float math, float english,float computer) {
        this.computer = computer;
        this.stuno = stuno;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public Student() {
    }

    public String getStuno() {
        return stuno;
    }

    public String getName() {
        return name;
    }

    public float getMath() {
        return math;
    }

    public float getEnglish() {
        return english;
    }

    public float getComputer() {
        return computer;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }

    public float sum(){
        return this.math+this.computer+this.english;
    }

    public float avg(){
//        float sum = this.math+this.computer+this.english;
        return this.sum()/3;
    }

    public float max(){
//        float temp = 0;
//        if(this.math>=this.computer && this.math>=this.english){
//            temp = this.math;
//        }else if(this.computer>=this.math&&this.computer>=this.english){
//            temp = this.computer;
//        }else{
//            temp = this.english;
//        }
//        return temp;
        float max = this.math;
        max = max > this.computer ? max : this.computer;
        max = max > this.english ? max : this.english;
        return max;
    }

    public float min(){
//        float temp = 0;
//        if(this.math<=this.computer && this.math<=this.english){
//            temp = this.math;
//        }else if(this.computer<=this.math&&this.computer<=this.english){
//            temp = this.computer;
//        }else{
//            temp = this.english;
//        }
//        return temp;
        float min = this.math;
        min = min < this.computer ? min : this.computer;
        min = min < this.english ? min : this.english;
        return min;
    }
}
