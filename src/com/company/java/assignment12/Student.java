package com.company.java.assignment12;

public class Student
{
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public void setEngDepartment(String engDepartment) {
        this.engDepartment = engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public double getPerTillDat() {
        return perTillDat;
    }

    public void setPerTillDat(double perTillDat) {
        this.perTillDat = perTillDat;
    }

    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String engDepartment;
    private int yearOfEnrollment;
    private  double perTillDat;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDat) {
        this.id=id;
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDat=perTillDat;
    }
}
