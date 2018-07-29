package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Emp6_4 extends Employee6_4 {
    private String dept;
    private float salaryMon;

    @Override
    public String toString() {
        return super.toString() + ",所属部门:" + this.dept
                + ",月薪:" + this.salaryMon;
    }

    public Emp6_4(int age, String name, char sex, String dept, float salaryMon) {
        super(age, name, sex);
        this.dept = dept;
        this.salaryMon = salaryMon;
    }
}
