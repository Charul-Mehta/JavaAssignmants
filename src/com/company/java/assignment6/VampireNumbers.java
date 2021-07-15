package com.company.java.assignment6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VampireNumbers
{
    public void generateVampireNumbers()
    {
        int x=10;
        int y=11;
        int t=0;
        List<Integer> finallist=new ArrayList<>();
        String[] numbersOfVampireNum;
        String[] numbersOfxAndy;

        while(t<100)
        {
            int vampireNum=x*y;
            if(String.valueOf(vampireNum).split("").length%2!=0)
            {
                if(String.valueOf(x).split("").length<String.valueOf(y).split("").length)
                {
                    x++;
                    y=x+1;
                }
                else y++;
            }
            else
            {
                numbersOfVampireNum = String.valueOf(vampireNum).split("");
                numbersOfxAndy = (String.valueOf(x) + String.valueOf(y)).split("");
                java.util.Arrays.sort(numbersOfVampireNum);
                java.util.Arrays.sort(numbersOfxAndy);
                if (java.util.Arrays.equals(numbersOfVampireNum, numbersOfxAndy)){
                    //System.out.println(vampireNum);
                    finallist.add(vampireNum);
                    if(String.valueOf(x).split("").length<String.valueOf(y).split("").length)
                    {
                        x++;
                        y=x+1;
                    }
                    else y++;
                    t++;
                }
                else {
                    if(String.valueOf(x).split("").length<String.valueOf(y).split("").length)
                    {
                        x++;
                        y=x+1;
                    }
                    else y++;
                }
            }

        }

        Collections.sort(finallist);

        for (int i:finallist) {
            System.out.println(i);
        }
    }
}
