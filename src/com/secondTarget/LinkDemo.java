package com.secondTarget;

import com.firstKind.Node;

/**
 * Created by lpl on 2018/6/21.
 */
public class LinkDemo {
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node a = new Node("车厢-1");
        Node b = new Node("车厢-2");
        Node c = new Node("车厢-3");

        root.setNext(a);
        a.setNext(b);
        b.setNext(c);

        printData(root);

    }

    public static void printData(Node node){
        System.out.print(node.getDate() + "\t");
        if(node.getNext()!=null){
            printData(node.getNext());
        }
    }
}
