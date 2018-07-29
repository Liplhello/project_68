package com.secondTarget;

import com.firstKind.*;

/**
 * Created by lpl on 2018/7/2.
 */
public class CaseDemo01 {
    public static void main(String[] args) {
        USB usb = null;
        if(args.length>0){
            usb = Factory.getInstance(args[0]);
        }
        if(usb!=null){
            Computer.plugin(usb);
        }

//        USB usb = null;
//        usb = Factory.getInstance("print");
//        Computer.plugin(usb);

//        Computer.plugin(new Flash());
//        Computer.plugin(new Print());
    }
}
