package com.module1.ArrayPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
//ВАРИАНТ С КОЛЛЕКЦИЯМИ
public class CountStringAnotherVariant {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\module1\\ArrayPractice\\harry.txt")));
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
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"("+entry.getValue()+")\t");
        }
    }
}
