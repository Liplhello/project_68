package com.secondTarget;

import com.firstKind.Employee5_7;

/**
 * Created by lpl on 2018/6/25.
 */
public class EmployeeDemo5_7 {
    public static void main(String[] args) {
        Employee5_7 em1 = new Employee5_7();
        Employee5_7 em2 = new Employee5_7("000001");
        Employee5_7 em3 = new Employee5_7("000002","LEE");
        Employee5_7 em4 = new Employee5_7("000003","LRR",5600.0,"销售部");

        em1.print();
        em2.print();
        em3.print();
        em4.print();
    }
}
