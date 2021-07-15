package com.company.charul.assignment.data;

public class MyClass
{
    int firstMmember;
    char secondMember;

    public void printClassVariables(){
        System.out.println(firstMmember);
        System.out.println(secondMember);
    }

    // Our code will not print the local uninitialised values of the function as they are not default initialised. The class members get default type initialisation thus those values are printed
//    public void printLocalVariables(){
//        int localInt;
//        char localChar;
//        System.out.println(localInt);
//        System.out.println(localChar);
//    }
}
