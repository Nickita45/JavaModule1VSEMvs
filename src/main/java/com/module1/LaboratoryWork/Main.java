package com.module1.LaboratoryWork;

import com.module1.ArrayPractice.HarryPoterTextAnalys;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\module1\\ArrayPractice\\harry.txt")));
        String contentReplaced = content.replaceAll("[^A-Za-z ]", " ");
        String[] words = contentReplaced.split(" +");
        String[] lines = content.split("\\r?\\n");

        HarryPoterTextAnalys.printArray(lines, 20);

        //Task 1
        System.out.println("The longest word in the above text is: "+getLongestWordInArray(words));

        //Task 2
        System.out.println("Count the LINES where the word Harry is met:"+getCountWordInArrayString("Harry", lines));

        //Task 3
        String stringWithoudDup = HarryPoterTextAnalys.removeDubFromString(words);
        String[] wordsWithoudDup = contentReplaced.split(" +");
        HarryPoterTextAnalys.printArray(wordsWithoudDup,20);

        //Task 4
        System.out.println("Count words begin from the letter C:"+getCountWordsWithLetterOnBegin(wordsWithoudDup, 'C'));

        //Task 5 and Task 6
        TreeMap<String, Integer> hashMap = getHashByString(words);

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"("+entry.getValue()+")\t");
        }

    }
    public static String getLongestWordInArray(String[] words)
    {
        String longestWord = words[0];
        for(int i=0;i<words.length;i++)
        {
            if(longestWord.length() < words[i].length())
                longestWord = words[i];
        }
        return longestWord;
    }
    public static int getCountWordInArrayString(String word, String[] words)
    {
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(word))
                count++;
        }
        return count;
    }
    public static int getCountWordsWithLetterOnBegin(String[] words, char symbol)
    {
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].charAt(0) == symbol)
                count++;
                //System.out.println(words[i]);
        }
        return count;
    }
    public static TreeMap<String, Integer> getHashByString(String[] split)
    {
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
        return hashMap;
    }
}
