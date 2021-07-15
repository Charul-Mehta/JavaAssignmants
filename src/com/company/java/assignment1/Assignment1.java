package com.company.java.assignment1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Assignment1
{
    Path startDir = Paths.get(System.getProperty("user.home"));
    Scanner scanner = new Scanner(System.in);
    public void getMeFile()
    {
        while(true)
        {
            String pattern=scanner.nextLine();
            if(pattern.equals("end"))
                break;
            var fs = FileSystems.getDefault();
            var matcher = fs.getPathMatcher("glob:" + pattern);

            FileVisitor<Path> matcherVisitor = new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attribs) {
                    Path name = file.getFileName();
                    if (matcher.matches(name))
                    {
                        //To print the absolute path of the file
                        System.out.print(String.format("Found matched file: '%s'.%n", file));
                    }
                    //else continue
                    return FileVisitResult.CONTINUE;
                }
            };
            try
            {
                Files.walkFileTree(startDir, matcherVisitor);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
