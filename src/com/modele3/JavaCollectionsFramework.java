package com.modele3;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class JavaCollectionsFramework {
    private static int countElements = 100_000;
    public static void main(String[] args) {
        Integer[] elements = getElemenetsByMaxSize(countElements);

        List<Integer> list = new ArrayList<>();
        list = getTimeCreatingArray(list,elements);

        List<Integer> linkedList = new LinkedList<>();
        linkedList = getTimeCreatingArray(linkedList,elements);

        Integer[] newElements = getElemenetsByMaxSize(1000);
        addInMiddleArrayValues(list,newElements);
        addInMiddleArrayValues(linkedList,newElements);

        Integer[] newUpdatedElements = getElemenetsByMaxSize(1000);
        updateArrayValues(list,newUpdatedElements);
        updateArrayValues(linkedList,newUpdatedElements);

        removeArrayValues(list);
        removeArrayValues(linkedList);
        System.out.println(list.size());

    }
    public static List<Integer> getTimeCreatingArray(List list, Integer[] elements)
    {
        Watch watch = new Watch();
        watch.start();
        list.addAll(Arrays.asList(elements));

        watch.totalTime(list.getClass() + " addAll() = ");
        return list;
    }
    public static void addInMiddleArrayValues(List list,Integer[] elements)
    {
        Watch watch = new Watch();
        watch.start();
        list.addAll(0,Arrays.asList(elements));
        list.addAll(list.size()/2,Arrays.asList(elements));
        list.addAll(Arrays.asList(elements));

        watch.totalTime(list.getClass() + " addNewValue() = ");
    }
    public static void updateArrayValues(List list,Integer[] elements)
    {
        Watch watch = new Watch();
        watch.start();
        for(int i =0;i<1000;i++)
        {
            list.set(i,elements[i]);
            list.set(list.size()-1-i,elements[i]);
            list.set(list.size()/2+i,elements[i]);
        }

        watch.totalTime(list.getClass() + " updateValue() = ");
    }
    public static void removeArrayValues(List list)
    {
        Watch watch = new Watch();
        watch.start();

        list.subList(0,1000).clear();
        list.subList(list.size()/2,list.size()/2+1000).clear();
        list.subList(list.size()-1001,list.size()-1).clear();



        watch.totalTime(list.getClass() + " removeValue() = ");
    }
    public static Integer[] getElemenetsByMaxSize(int size)
    {
        Integer[] arr = new Integer[size];
        for(int i=0;i<size;i++)
            arr[i] = new Random().nextInt(10);
        return arr;
    }

    static class Watch {
        private long startTime;
        private long endTime;

        public void start() {
            startTime = System.nanoTime();
        }

        private void stop() {
            endTime = System.nanoTime();
        }

        public void totalTime(String s) {
            stop();
            System.out.println(s + (endTime - startTime));
        }
    }
}
