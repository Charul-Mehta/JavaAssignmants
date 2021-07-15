package com.company.java.assignment8;

public class BaseClass {

    public void methodToThrowException(String message) throws CustomExceptions, InvalidAgeException{
        if(message==""){
            System.out.println("dhfj");
        }
        else if(message=="hie"){
            throw new InvalidAgeException("1 Age");
        }
        else{
            throw new CustomExceptions("bad code");
        }

    }
}
