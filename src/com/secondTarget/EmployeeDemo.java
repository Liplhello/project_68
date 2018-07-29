package com.secondTarget;

import com.firstKind.Employee;

/**
 * Created by lpl on 2018/6/22.
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee em01 = new Employee("AKM-01","susan",5500,3.5);
        Employee em02 = new Employee("AKM-02","loran",6500,4.0);

        System.out.println("编号" + "  " + "姓名" + "  " + "基本工资" + "  " + "工资增额"
                + "  " + "总工资\t");
        System.out.println(em01.geteNom() + "  " + em01.geteName() + "  " + em01.getBasicSalary() + "  "
                + em01.increase() + "  " + em01.salary() + "\t");
        System.out.println(em02.geteNom() + "  " + em02.geteName() + "  " + em02.getBasicSalary() + "  "
                + em02.increase() + "  " + em02.salary() + "\t");
    }


}
