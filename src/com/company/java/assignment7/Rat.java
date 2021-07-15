package com.company.java.assignment7;

public class Rat implements Rodent{

    public Rat() {
        System.out.println("Hey, I'm a Rat");
    }

    @Override
    public void eat() {
        System.out.println("Rats eat very slow.");
    }

    @Override
    public void run() {
        System.out.println("Rat is lasy to run");
    }

    @Override
    public void sleep() {
        System.out.println("Rat sleeps the most");
    }
}
