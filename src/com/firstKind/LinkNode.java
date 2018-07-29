package com.firstKind;

/**
 * Created by lpl on 2018/6/21.
 */
public class LinkNode {
    private Node root;

    class Node{
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public void add(Node node){  //增加一个add操作
            if(this.next==null){     //判断下一个节点是否为空
                this.next = node;    //为空,则把新节点设置在next位置上
            }else{
                this.next.add(node); //不为空,则表示还有下一个节点,在下一个位置处增加
            }
        }

        public void print(){
            System.out.print(this.data + "\t");
            if(this.next!=null){      //下一个节点不为空,继续打印
                this.next.print();    //输出下一个节点
            }
        }

        public boolean search(String data){
            if(data.equals(this.data)){  //判断当前节点是否与查找的一致
                return true;             //一致,返回true
            }else{
                if(this.next!=null){     //不一致,下一个节点存在,继续查找
                    return this.next.search(data);   //返回下一个节点的查找结果
                }else{
                    return false;        //节点不存在,返回false
                }
            }
        }

        public void delete(Node previous, String data){
            if(data.equals(this.data)){         //找到匹配节点
                previous.next = this.next;           //空出当前节点
            }else{
                if(this.next!=null){
                    this.next.delete(this,data);     //继续向下找
                }
            }
        }
    };

    public void addNode(String data){
        Node newNode = new Node(data);
        if(this.root==null){
            this.root = newNode;
        }else{
            this.root.add(newNode);
        }
    }

    public void printNode(){
        if(this.root!=null){
            this.root.print();
        }
    }

    public boolean contains(String data){
        return this.root.search(data);
    }

    public void deleteNode(String data){
        if(this.contains(data)){
            if(this.root.data.equals(data)){
                this.root = this.root.next;
            }else{
                this.root.next.delete(root,data);
            }
        }
    }
}
