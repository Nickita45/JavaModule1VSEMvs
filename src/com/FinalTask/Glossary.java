package com.FinalTask;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Glossary {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\FinalTask\\harry.txt")));
        content = content.replaceAll("[^A-Za-z ]","");
        String[] split = content.split(" +");

        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(split));
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        for (String s1 : hashSet) {
            int num=0;
            for (int i = 0; i < split.length; i++) {
                if(s1.equals(split[i])){
                    num++;
                }
            }
            hashMap.put(s1,num);
        }


        System.out.println("1. Print first 20 value pair:");
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();

        entries.stream().limit(20).forEach(System.out::println);
        //1.4 - 1.6
        System.out.println("2. Print first 20 value pair with DESC sort:");
        entries.stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(20).forEach(System.out::println);

        //1.6 - 1.7
        System.out.println("Size of map:"+entries.size());

        TreeMap<String, Integer> hashMapCapital = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getKey().length() == 1)
                continue;
            if(Character.isUpperCase(entry.getKey().charAt(0)) && Character.isLowerCase(entry.getKey().charAt(1)))
                hashMapCapital.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Size of map with capital:"+hashMapCapital.size());
        hashMapCapital.entrySet().stream().limit(20).forEach(System.out::println);
        //1.8 - 1.9
        Set<Map.Entry<String, Integer>> entriesCapitals = hashMapCapital.entrySet();
        String stringCommaSeparated = entriesCapitals.stream().limit(20)
                .map(key -> key.getKey() + "=" + key.getValue())
                .collect(Collectors.joining("\n"));
        writeToFileData(stringCommaSeparated,20,"Harry Potter");

    }
    public static void writeToFileData(String strIn,int countWords,String nameOfText)
    {
        strIn = "The first " + countWords +
                " words of the sorted dictionary, taking into account only proper names (with a capital letter). "+
                "\nThe number of words encountered in the text was counted." +
                "\nText - "+nameOfText+
                "\nThe work was done by Mykyta Plotnikov"+
                "\n\n"+strIn;

        try {
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write(strIn);
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
