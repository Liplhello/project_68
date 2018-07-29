package com.secondTarget;

import com.firstKind.Student;

import java.text.DecimalFormat;

/**
 * Created by lpl on 2018/6/19.
 */
public class StudentDemo01 {
    public static void main(String[] args) {
        Student stu = new Student("201801","Ella",89f,90.5f,88f);
        DecimalFormat dec = new DecimalFormat(".00");
        System.out.println("学生学号:" + stu.getStuno());
        System.out.println("学生姓名:" + stu.getName());
        System.out.println("数学成绩:" + stu.getMath());
        System.out.println("计算机成绩:" + stu.getComputer());
        System.out.println("英语成绩:" + stu.getEnglish());
        System.out.println("成绩总和:" + stu.sum());
        System.out.println("成绩均分:" + dec.format(stu.avg()));
        System.out.println("最高分:" + stu.max());
        System.out.println("最低分:" + stu.min());
    }
}
