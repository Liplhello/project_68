package com.firstKind;

/**
 * Created by lpl on 2018/6/21.
 */
public class Node {
    private String date;
    private Node next;

    public Node(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
