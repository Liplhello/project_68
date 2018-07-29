package com.firstKind;

/**
 * Created by lpl on 2018/6/21.
 */
public class Address5_1 {
    private String country;
    private String province;
    private String city;
    private String street;
    private String zipCode;

    public Address5_1() {
    }

    public Address5_1(String country, String province, String city, String street, String zipCode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void print(){
        System.out.println(this.country + "-" + this.province + "-" + this.city + "-" + this.street
                + "-" + this.zipCode);
    }
}
