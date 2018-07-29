package com.firstKind;

/**
 * Created by lpl on 2018/7/3.
 */
public class Proxy implements NetWork {
    private NetWork network;

    public Proxy(NetWork network) {
        this.network = network;
    }

    public void check(){
        System.out.println("检查用户是否合法");
    }

    @Override
    public void beowse() {
        this.check();
        this.network.beowse();
    }
}
