package com.FinalTask;

import java.util.Arrays;
import java.util.Comparator;

public class CommonPrefix {
    public static String prefix(String[] array) {
        String prefixStr = "";
        String minString = Arrays.stream(array).min(Comparator.comparing(String::length)).get();

        for (int i = 0; i < minString.length()+1; i++) {
            prefixStr = array[0].substring(0, i);

            for (String str : array) {
                if (!str.substring(0, i).equals(prefixStr))
                    return str.substring(0, i-1);
            }

        }

        return prefixStr;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"};

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"};

        System.out.println(prefix(array2)); // abc
    }
}