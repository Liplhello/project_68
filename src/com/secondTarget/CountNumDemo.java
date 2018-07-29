package com.secondTarget;

import com.firstKind.CountNum;

/**
 * Created by lpl on 2018/6/22.
 */
public class CountNumDemo {
    public static void main(String[] args) {
        String str = "want you to know one thing";

        CountNum cou1 = new CountNum();
        CountNum cou5 = new CountNum("",'A');

        CountNum cou2 = new CountNum(str,'n');
        CountNum cou3 = new CountNum(str,'o');
        CountNum cou4 = new CountNum(str,'a');

        cou1.countCharNum();
        cou5.countCharNum();
        cou2.countCharNum();
        cou3.countCharNum();
        cou4.countCharNum();
    }
}
