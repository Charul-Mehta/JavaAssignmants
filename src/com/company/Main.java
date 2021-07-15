package com.company;

import com.company.charul.assignment.data.MyClass;
import com.company.java.assignment.SecondClass;
import com.company.java.assignment10.SList;
import com.company.java.assignment10.SListIterator;
import com.company.java.assignment11.ReadFile;
import com.company.java.assignment12.Student;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.util.ArrayList.*;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
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
        //Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
//        String sentence=scanner.nextLine();
//        var assignment9=new Assignment9();
//        System.out.println(assignment9.checkSentence(sentence));

        //Assignment 10
//        SList<String> sList = new SList<>();
//        SListIterator<String> iterator = sList.iterator(sList.getLink());
//        iterator.insert("ABC");
//        iterator.insert("EFG");
//        iterator.insert("HIJ");
//        System.out.println(sList);

        //Assignment 11
//        ReadFile assignment11=new ReadFile();
//        assignment11.readCharactersFromFile("/home/charum/File1.txt");

        //Assignment 12
//          List<Student> students= initializeStudents();
//
//          printAllDistinctDepts(students);
//
//          printChildrenWhoJoinedAfter2018(students);
//
//          printMaleInCS(students);
//
//          printTotalMalesAndFemales(students);
//
//          printAvgAgeOfMalesAndFemales(students);
//
//          printStudentWithMaxPercent(students);
//
//          printNoOfStudentsInEachDept(students);
//
//          printAvgPercentageInDepts(students);
//
//          printMinAgeOfStudentInElectronics(students);
//
//          printStudentsInCS(students);
//

    }

    private static void printStudentsInCS(List<Student> students) {
        var studentsInCS=students.stream().filter(x-> x.getEngDepartment()=="Computer Science").collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(studentsInCS);
    }

    private static void printMinAgeOfStudentInElectronics(List<Student> students) {
        Student minAgeOfStudentInElectronics=students.stream().filter(x->x.getEngDepartment()=="Electronic").collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).get();
        System.out.println(minAgeOfStudentInElectronics.getName());
    }

    private static void printAvgPercentageInDepts(List<Student> students) {
        var avgPercentageInDepts=students.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDat)));
        System.out.println(avgPercentageInDepts);
    }

    private static void printNoOfStudentsInEachDept(List<Student> students) {
        var noOfStudentsInEachDept=students.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()));
        System.out.println(noOfStudentsInEachDept);

    }

    private static void printStudentWithMaxPercent(List<Student> students) {
        Student studentWithMaxPercent=students.stream().max(Comparator.comparing(Student::getPerTillDat)).get();
        System.out.println(studentWithMaxPercent.getName());
    }

    private static void printAvgAgeOfMalesAndFemales(List<Student> students) {
        var avgAge = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println(avgAge);
    }

    private static void printTotalMalesAndFemales(List<Student> students) {
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }

    private static void printMaleInCS(List<Student> students) {
        var maleInCS=students.stream().filter(x->x.getGender()=="Male" && x.getEngDepartment()=="Computer Science").map(y->y.getName()).collect(Collectors.toList());
        System.out.println(maleInCS);
    }

    private static void printChildrenWhoJoinedAfter2018(List<Student> students) {
        var children=students.stream().filter(y->y.getYearOfEnrollment()>2018).map(x->x.getName()).collect(Collectors.toList());
        System.out.println(children);
    }

    private static void printAllDistinctDepts(List<Student> students) {
        var depts=students.stream().map(x-> x.getEngDepartment()).distinct().sorted().collect(Collectors.toList());
        System.out.println(depts);
    }

    //Extra function to find out occurance of all the characters in string
    private static boolean checkStringForAllLetterUsingRegex(String input) {
        return input.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

    private  static List<Student> initializeStudents(){
        List<Student> students= new ArrayList<Student>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        return students;
    }

}
