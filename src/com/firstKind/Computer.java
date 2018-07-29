package com.firstKind;

/**
 * Created by lpl on 2018/7/2.
 */
public class Computer {
    public static void plugin(USB usb){
        usb.start();
        System.out.println("========设备工作中========");
        usb.stop();
    }
}
