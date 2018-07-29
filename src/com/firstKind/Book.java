package com.firstKind;

/**
 * Created by lpl on 2018/6/19.
 */
public class Book {
    private String title;
    private float price;
    private Person01 perspn01;

    public Book(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public Person01 getPerspn01() {

        return perspn01;
    }

    public void setPerspn01(Person01 perspn01) {
        this.perspn01 = perspn01;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
