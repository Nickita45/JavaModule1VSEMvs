package com.module1.ArrayPractice;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class HarryPoterTextAnalys {
    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\module1\\ArrayPractice\\harry.txt")));
        content = content.replaceAll("[^A-Za-z ]","");

        String[] words = content.split(" +");
        printArray(words,20);

        //Я сделал через массив, но лучше через словарь и перебор не for i тогда и будет быстрее
        //HashSet<String> hashSet = new HashSet<String>(Arrays.asList(words));
        String contentWithoudDup = removeDubFromString(words);//deDup(content);
        String[] wordsWithoudDup = contentWithoudDup.split(" +");
        Arrays.sort(wordsWithoudDup);

        printCountDuplicates(wordsWithoudDup,words);

    }
    //Функция получения строки черех хеш
    public static String deDup(String s) {
        return new LinkedHashSet<String>(Arrays.asList(s.split(" +"))).toString().replaceAll("[^A-Za-z ]","");
    }
    public static String removeDubFromString(String[] s)
    {
        String result = "";
        for(int i=0;i<s.length;i++)
        {
            if(!result.contains(s[i]))
                result+=s[i]+" ";
        }
        return  result;
    }
    public static void printCountDuplicates(String[] deBupString,String[] original)
    {
        for(int i=0;i<deBupString.length;i++)
        {
            int count = 0;
            for(int j=0;j< original.length;j++)
            {
                if(deBupString[i].equals(original[j]))
                {
                    count++;
                }
            }
            System.out.println(deBupString[i] + "-" + count);
        }
    }
    public static void printArray(String[] array, int length)
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
