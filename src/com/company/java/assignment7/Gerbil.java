package com.company.java.assignment7;

public class Gerbil implements Rodent
{
    public Gerbil() {
        System.out.println("Hey, I'm a Gerbil");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil eats very fast.");
    }

    @Override
    public void run() {
        System.out.println("Gerbil is quick to run");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil sleeps very less");
    }
}
