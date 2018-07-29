package com.firstKind;

/**
 * Created by lpl on 2018/7/2.
 */
public class Print implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
