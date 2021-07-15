package com.company.charul.assignment.singelton;

public class SingeltonClass
{
    String name;

    //this.name=name;: non-static variable this cannot be referenced from a static context
    public static SingeltonClass methodToReturnObject(String name)
    {
        //this.name=name;
        return  new SingeltonClass();

    }

    public void printTheString()
    {
        System.out.println(this.name);
    }
}
