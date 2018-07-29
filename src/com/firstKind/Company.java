package com.firstKind;

/**
 * Created by lpl on 2018/7/9.
 */
public class Company implements ClassName{
    @Override
    public void getClaaName() {
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().getCanonicalName());
        System.out.println(this.getClass().getSimpleName());
    }
}
