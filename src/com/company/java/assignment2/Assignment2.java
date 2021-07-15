package com.company.java.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment2
{
    List<Character> charList=new ArrayList<Character>();

    //Function to check whether all the characters from a-z are present in the given string or not.
    //Time complexity O(n) and space complexity O(n)
    public boolean checkAllCharacters(String input)
    {
        for (Character chars:input.toCharArray())
        {
            if(!charList.contains(chars))
                charList.add(chars);
        }
        return charList.size()==26;
    }
}
