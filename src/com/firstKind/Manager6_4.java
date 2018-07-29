package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Manager6_4 extends Employee6_4 {
    private String job;
    private float salaryYear;

    @Override
    public String toString() {
        return super.toString() + ",管理层:" + this.job
                + ",年薪:" + this.salaryYear;
    }

    public Manager6_4(int age, String name, char sex, String job, float salaryYear) {
        super(age, name, sex);
        this.job = job;
        this.salaryYear = salaryYear;
    }
}
