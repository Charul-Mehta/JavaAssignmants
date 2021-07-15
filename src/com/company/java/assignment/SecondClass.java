package com.company.java.assignment;

public class SecondClass extends FirstClass implements FourthInterface
{
    @Override
    public void firstMethod() {
        System.out.println("Im 1st method");
    }

    @Override
    public void secondMethod() {
        System.out.println("Im 2nd method");
    }

    @Override
    public void ninethMethod() {
        System.out.println("Im 9th method");
    }

    @Override
    public void thirdMethod() {
        System.out.println("Im 3rd method");
    }

    @Override
    public void fourthMethod() {
        System.out.println("Im 4th method");
    }

    @Override
    public void sixthMethod() {
        System.out.println("Im 6th method");
    }

    @Override
    public void fifthMethod() {
        System.out.println("Im 5th method");
    }

    public  void eleventhMethod(FirstInterface firstInterface){
        System.out.println("Im from 11th");
    }

}
