package com.secondTarget;

/**
 * Created by lpl on 2018/7/11.
 */
public class AssertTest {
    public static void main(String[] args) {
        int x[] = {1,2,3};
        assert x.length == 0 : "数组长度不为0";
    }
}
