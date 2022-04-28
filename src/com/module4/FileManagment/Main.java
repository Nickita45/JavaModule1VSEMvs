package com.module4.FileManagment;

import com.module3.JavaCollectionsFramework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException
    {
        JavaCollectionsFramework.Watch watch = new JavaCollectionsFramework.Watch();

        watch.start();
        String path = "C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\module4\\FileManagment\\logs.txt";
        String content = new String(Files.readAllBytes(Paths.get(path)));
        String[] lines = content.split("\n");

        List<String> listWithErrors = Arrays.stream(lines).filter(line -> line.contains("Exception")).collect(Collectors.toList());
        System.out.println(listWithErrors.size());
        watch.totalTime( "Using readAllBytes and split function = ");

        watch.start();
        List<String> stringListReadAllLine = Files.readAllLines(Paths.get("C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\module4\\FileManagment\\logs.txt"))
                .stream().filter(line -> line.contains("Exception")).collect(Collectors.toList());;
        System.out.println("Total number of lines:"+stringListReadAllLine.size());
        watch.totalTime( "Using readAllLines = ");


        System.out.println("Total number of lines:"+lines.length);
    }
}
