package com.bjsxt;

/**
 * Person class
 */

public class Person {
    private int id;
    private String name;
    private String age;
    private String gender;
    private String telNum;
    private String address;

    public Person(String name, String age, String gender, String telNum, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.telNum = telNum;
        this.address = address;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Item number").append(this.id).append("#").append("\t");
        sb.append("Name: ").append(this.name).append("\t\t");
        sb.append("Age: ").append(this.age).append("\t\t");
        sb.append("Gender: ").append(this.gender).append("\t\t");
        sb.append("Tel-number: ").append(this.telNum).append("\t\t");
        sb.append("Address: ").append(this.address);
        return sb.toString();
    }
}
