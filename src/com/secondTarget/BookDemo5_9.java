package com.secondTarget;

import com.firstKind.Book5_9;

/**
 * Created by lpl on 2018/6/25.
 */
public class BookDemo5_9 {
    public static void main(String[] args) {
        Book5_9 book1 = new Book5_9("阿图书",33.3f);
        Book5_9 book2 = new Book5_9("本图书",53.2f);
        Book5_9 book3 = new Book5_9("从图书",26.54f);
        Book5_9 book4 = new Book5_9("的图书",65.4f);

        book1.print();
        book2.print();
        book3.print();
        book4.print();
        System.out.println("图书总册数:" + book1.countBook());
    }
}
