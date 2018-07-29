package com.secondTarget;

import com.firstKind.NetWork;
import com.firstKind.Proxy;
import com.firstKind.Real;

/**
 * Created by lpl on 2018/7/3.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        NetWork net = null;
        net = new Proxy(new Real());
        net.beowse();
    }
}
