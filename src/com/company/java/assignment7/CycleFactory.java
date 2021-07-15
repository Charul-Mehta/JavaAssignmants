package com.company.java.assignment7;

public class CycleFactory
{
    public Cycle createCycle(String type)
    {
     if(type==null || type.isEmpty()) return null;
     if("Bicycle".equals(type)) return new Bicycle();
     if("UniCycle".equals(type)) return new UniCycle();
     if("Tricycle".equals(type)) return new Tricycle();
     else return null;
    }

}
