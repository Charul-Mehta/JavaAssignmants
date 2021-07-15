package com.company.java.assignment11;

import java.io.*;
import java.util.*;

public class ReadFile
{
    public void readCharactersFromFile(String filepath) throws IOException {
        Map<Character,Integer> map= new TreeMap<>();

        File file=new File(filepath);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
            for (Character ch:sc.nextLine().toLowerCase(Locale.ROOT).toCharArray()) {
                if(!map.containsKey(ch))
                    map.put(ch,1);
                else
                    map.put(ch, map.get(ch) + 1);
            }
        }

        File newFile = new File("/home/charum/ResultFile.txt");
        if (newFile.createNewFile()) {
            System.out.println("File created: " + newFile.getName());
        } else {
            System.out.println("File already exists.");
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            try {
                writer.write("Key = " + key + ", Value = " + value +"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writer.close();
    }
}
