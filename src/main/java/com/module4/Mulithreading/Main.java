package com.module4.Mulithreading;

import com.module3.JavaCollectionsFramework;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\John Locke\\IdeaProjects\\HelloWorld\\src\\com\\module4\\FileManagment\\logs.txt";
        String[] dates = new String[] {"2019-10-13","2019-10-14","2019-10-16","2019-10-17","2019-10-21"};

        JavaCollectionsFramework.Watch watch = new JavaCollectionsFramework.Watch();
        watch.start();
        for (int i = 0; i < dates.length; i++){
            LogManagement logManagement = new LogManagement(dates[i], path);
            logManagement.findAllErrorsByPath();
            System.out.print("\n");
        }
        watch.totalTime("Total time working in consistent way:");
        //Threads
        watch.start();
        for (int i = 0; i < dates.length; i++){
            LogManagement logManagement = new LogManagement(dates[i], path);
            Thread thread = new Thread(logManagement);
            thread.start();
        }
        //watch.totalTime("Total time working in parallel way:");
    }
}
