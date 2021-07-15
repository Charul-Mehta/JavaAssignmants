package com.company.java.assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9
{
    public boolean checkSentence(String sentence){
        boolean flag=false;
        Pattern pattern = Pattern.compile("[A-Z]*");
        Matcher matcher = pattern.matcher(sentence);
        flag = matcher.matches();

        return flag;
    }
}
