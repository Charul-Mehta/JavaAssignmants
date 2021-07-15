package com.company;

import com.company.charul.assignment.data.MyClass;
import com.company.java.assignment.SecondClass;
import com.company.java.assignment2.Assignment2;
import com.company.java.assignment3.Assignment3;
import com.company.java.assignment4.Assignment4;
import com.company.java.assignment6.ConstructorCalls;
import com.company.java.assignment6.OverloadedCunstructors;
import com.company.java.assignment6.VampireNumbers;
import com.company.java.assignment7.*;
import com.company.java.assignment8.BaseClass;
import com.company.java.assignment8.CustomExceptions;
import com.company.java.assignment8.InvalidAgeException;
import com.company.java.assignment9.Assignment9;

import javax.management.remote.JMXServerErrorException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        //var assignment1= new Assignment1();
        //assignment1.getMeFile();

        /*String in=scanner.nextLine();
        var assignment2= new Assignment2();
        //REMOVING OTHER CHARACTERS OTHER THAN A-Z
        System.out.println(assignment2.checkAllCharacters(in.toLowerCase().replaceAll("[^a-z]", "")));*/

        //var assignment3=new Assignment3();
        //assignment3.ping(scanner.nextLine());

//        var assignment4= new Assignment4();
//        assignment4.getKYCDates();

        //var assignment5= new MyClass();
        //assignment5.printClassVariables();

        //To print first 100Vampire Numbers
        //var assignment6=new VampireNumbers();
        //assignment6.generateVampireNumbers();

        // Constructors are called only when objects are created
//        ConstructorCalls[] myArray=new ConstructorCalls[2];
//        myArray[0]=new ConstructorCalls();
//        myArray[1]=new ConstructorCalls();

//        Rodent[] rod=new Rodent[3];
//        rod[0]=new Rat();
//        rod[1]=new Hamster();
//        rod[2]=new Gerbil();
//        for (Rodent rods:rod)OverloadedCunstructors
//        {
//            rods.eat();
//            rods.run();
//            rods.sleep();
//        }

//        Bicycle bicycle=new Bicycle();
//        Tricycle tricycle=new Tricycle();
//        UniCycle uniCycle=new UniCycle();
//        Cycle[] cycles=new Cycle[]{bicycle,tricycle,uniCycle};
////        for (Cycle cycle:cycles) {
////            cycle.balance();
////        }
//        bicycle.balance();
//        uniCycle.balance();

//         //Assignment 7.4
        //Implementing Factory Design Pattern
//          CycleFactory factory=new CycleFactory();
//          factory.createCycle("Bicycle").balance();

        //Assignment 7.3
        //TODO:
//        var obj=new SecondClass();
//        obj.eleventhMethod(obj);

        //Assignment8
//        try {
//            var assignment8 = new BaseClass();
//            assignment8.methodToThrowException("hie");
//        } catch (InvalidAgeException | CustomExceptions | NullPointerException c) {
//            System.out.println("Cought exception" + c);
//        } finally {
//            System.out.println("finally executed");
//        }

//        //Assignment 9
        String sentence=scanner.nextLine();
        var assignment9=new Assignment9();
        System.out.println(assignment9.checkSentence(sentence));
    }

    //Extra function to find out occurance of all the characters in string
    private static boolean checkStringForAllLetterUsingRegex(String input) {
        return input.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

}
