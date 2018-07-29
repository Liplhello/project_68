package com.firstKind;

/**
 * Created by lpl on 2018/6/22.
 */
public class User {
    private String userName;
    private String password;
    private static int count;

    public User() {
        count++;
    }

    public User(String userName) {
        this();
        this.userName = userName;
    }

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void print(){
        System.out.println("该用户的用户名:" + this.userName + ",密码:" + this.password
                + ",目前已有" + this.count + "用户");
    }
}
