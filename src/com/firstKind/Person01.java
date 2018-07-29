package com.firstKind;

/**
 * Created by lpl on 2018/6/19.
 */
public class Person01 {
    private int age;
    private String name;
    private Book book;
    private Person01 child;

    public Person01() {}

    public Person01(String name) {
        this.setName(name);
    }

    public Person01(String name,int age) {
        this.setName(name);
        this.setAge(age);
//        System.out.println("一个新的Person对象生成。");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 0 &&age <=150){
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person01 getChild() {
        return child;
    }

    public void setChild(Person01 child) {
        this.child = child;
    }

    public void tell(){
        System.out.println("姓名:" + this.getName() + ", 年龄:" + this.getAge());
    }
}

