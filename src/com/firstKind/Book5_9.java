package com.firstKind;

/**
 * Created by lpl on 2018/6/25.
 */
public class Book5_9 {
    private String bookName;
    private float price;
    private String bookId;

    private static int count;

    public Book5_9() {
        count++;
        String bookPre = "WOAIBOOK";
        this.bookId = bookPre + count;
    }

    public Book5_9(String bookName, float price) {
        this();
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public float getPrice() {
        return price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void print(){
        System.out.println("书名:" + this.bookName + ",编号:" + this.bookId
                + ",价格:" + this.price);
    }

    public int countBook() {
        return this.count;
    }
}
