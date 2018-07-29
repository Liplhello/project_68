package com.firstKind;

/**
 * Created by lpl on 2018/6/25.
 */
public class BankUser5_8 {
    private String userName;
    private double balance;

    public BankUser5_8(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void balance(){
        System.out.println(this.userName + "的账号余额为:" + this.balance);
    }
}
