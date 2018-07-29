package com.secondTarget;

import com.firstKind.Window;
import com.firstKind.WindowImpl;

/**
 * Created by lpl on 2018/7/3.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Window win = new WindowImpl(); //实现接口对象
        win.open();
        win.close();
    }
}
