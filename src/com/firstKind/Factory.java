package com.firstKind;

/**
 * Created by lpl on 2018/7/2.
 */
public class Factory {
    public static USB getInstance(String className){
        USB usb = null;
        if("flash".equals(className)){
            usb = new Flash();
        }
        if("print".equals(className)){
            usb = new Print();
        }
        return usb;
    }
}
