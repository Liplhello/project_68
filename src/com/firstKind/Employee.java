package com.firstKind;

/**
 * Created by lpl on 2018/6/22.
 */
public class Employee {
    private String eNom;
    private String eName;
    private double basicSalary;
    private double byPercent;

    public Employee() {
    }

    public Employee(String eNom, String eName, double basicSalary, double byPercent) {
        this.eNom = eNom;
        this.eName = eName;
        this.basicSalary = basicSalary;
        this.byPercent = byPercent;
    }

    public String geteNom() {
        return eNom;
    }

    public String geteName() {
        return eName;
    }

    public void seteNom(String eNom) {
        this.eNom = eNom;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getByPercent() {
        return byPercent;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setByPercent(double byPercent) {
        this.byPercent = byPercent;
    }

    public double increase(){
        return this.basicSalary * (this.byPercent/100);
    }

    public double salary(){
        return this.basicSalary * (1+this.byPercent);
    }
}
