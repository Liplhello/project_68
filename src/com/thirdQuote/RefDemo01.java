package com.thirdQuote;

import com.firstKind.Book;
import com.firstKind.Person01;

/**
 * Created by lpl on 2018/6/19.
 */
public class RefDemo01 {
    public static void main(String[] args) {
        Person01 per = new Person01("Ella",38);
        Person01 child = new Person01("May",8);
        Book book = new Book("java开发实战经典",99.9f);
        Book bch = new Book("一千零一夜",30.3f);

        per.setBook(book);
        book.setPerspn01(per);

        per.setChild(child);
        bch.setPerspn01(child);
        child.setBook(bch);

        System.out.println("从书找到人 --> 书名: " + book.getTitle() + "; 价格: " + book.getPrice() + "; 姓名: "
                + book.getPerspn01().getName() + "; 年龄: " + book.getPerspn01().getAge());
        System.out.println("从人找到书 --> 姓名: " + per.getName() + "; 年龄: " + per.getAge() + "; 书名: "
                + per.getBook().getTitle() + "; 价格: " + per.getBook().getPrice());
        //通过人找到孩子,并找到孩子拥有的书
        System.out.println(per.getName() + "的孩子 --> 姓名: " + per.getChild().getName() + "; 年龄: " + child.getAge() + "; 书名: "
                + child.getBook().getTitle() + "; 价格: " + bch.getPrice());
    }
}
