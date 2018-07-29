package com.firstKind;

/**
 * Created by lpl on 2018/6/25.
 */
public class Employee5_7 {
    private String userId;
    private String userName;
    private double salary;
    private String depart;

    public Employee5_7() {
    }

    public Employee5_7(String userId) {
        this.userId = userId;
    }

    public Employee5_7(String userId, String userName, double salary, String depart) {
        this.userId = userId;
        this.userName = userName;
        this.salary = salary;
        this.depart = depart;
    }

    public Employee5_7(String userId, String userName) {

        this.userId = userId;
        this.userName = userName;
    }

    public void print(){
        System.out.println("员工编号:" + this.userId + ",姓名:" + this.userName
                + ",薪水:" + this.salary + ",部门:" + this.depart);
    }
}
