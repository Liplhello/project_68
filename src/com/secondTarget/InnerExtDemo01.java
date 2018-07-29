package com.secondTarget;

import com.firstKind.H;
import com.firstKind.J;

/**
 * Created by lpl on 2018/7/3.
 */
public class InnerExtDemo01 {
    public static void main(String[] args) {
        H.I h = new J().new K();
        H h1 = new J();
        h.printI();
        h1.printH();
    }
}
