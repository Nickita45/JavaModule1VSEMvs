package com.FinalTask;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        for(int i = 1 ; i < array.length;i++)
            if(array[i] == array[i-1])
                return true;
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}
