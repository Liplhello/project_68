package com.firstKind;

/**
 * Created by lpl on 2018/6/30.
 */
public class Student6_191 extends AbstractPerson{
    private String school;

    public Student6_191(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String getInfo() {
        return "姓名: " + super.getName()
                + ", 年龄: " + super.getAge()
                + ", 学校: " + this.getSchool();
    }
}
