package com.secondTarget;

import com.firstKind.LinkNode;

/**
 * Created by lpl on 2018/6/21.
 */
public class LinkNodeDemo {
    public static void main(String[] args) {
        LinkNode linknode = new LinkNode();
        linknode.addNode("a");
        linknode.addNode("b");
        linknode.addNode("c");
        linknode.addNode("d");
        linknode.addNode("e");
        System.out.println("============删除之前===============");

        linknode.printNode();
        linknode.deleteNode("c");
        linknode.deleteNode("f");
        System.out.println();
        System.out.println("=============删除之后==============");

        linknode.printNode();
        System.out.println();
        System.out.println("查询节点:" + linknode.contains("a"));
    }
}
