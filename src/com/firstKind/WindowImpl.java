package com.firstKind;

/**
 * Created by lpl on 2018/7/3.
 */
public class WindowImpl extends WindowAdapter {
    @Override
    public void open() {
        super.open();
        System.out.println("窗口打开");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("窗口关闭");
    }
}
