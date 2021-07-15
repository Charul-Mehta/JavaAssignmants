package com.company.charul.assignment.main;

import com.company.charul.assignment.data.MyClass;
import com.company.charul.assignment.singelton.SingeltonClass;

public class Main
{
    public static void main(String[] args)
    {
        var myClassObj=new MyClass();
        myClassObj.printClassVariables();

        SingeltonClass singletonObj=SingeltonClass.methodToReturnObject("charul");
        singletonObj.printTheString();

    }

}
