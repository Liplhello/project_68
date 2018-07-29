package com.secondTarget;

import com.firstKind.User;

/**
 * Created by lpl on 2018/6/25.
 */
public class UserDemo5_5 {
    public static void main(String[] args) {
        User us1 = new User();
        User us2 = new User("lee");
        User us3 = new User("lee","leeele");

        us3.print();

        User us4 = new User("haha","haj");

        us3.print();
        us4.print();
    }
}
