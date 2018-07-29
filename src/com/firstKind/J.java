package com.firstKind;

/**
 * Created by lpl on 2018/7/3.
 */
public class J extends H {
    @Override
    public void printH() {
        System.out.println("Hello --> H");
    }
    public class K implements I{
        @Override
        public void printI() {
            System.out.println("Hello --> I");
        }
    }
}
