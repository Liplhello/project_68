package com.firstKind;

/**
 * Created by lpl on 2018/7/2.
 */
public class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
