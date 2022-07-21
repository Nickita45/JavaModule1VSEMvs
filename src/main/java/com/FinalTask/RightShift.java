package com.FinalTask;

import java.util.*;
import java.util.stream.Collectors;

public class RightShift {
    public static int[] rightShift(int[] array, int step){
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        Collections.rotate(list, step);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}