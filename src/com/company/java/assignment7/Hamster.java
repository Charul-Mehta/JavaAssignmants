package com.company.java.assignment7;

public class Hamster implements Rodent{

    public Hamster() {
        System.out.println("Hey, I'm a Hamster");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eats very fast.");
    }

    @Override
    public void run() {
        System.out.println("Hamster is quick to run");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster sleeps very less");
    }
}
