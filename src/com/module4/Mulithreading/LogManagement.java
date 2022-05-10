package com.module4.Mulithreading;

import com.module3.JavaCollectionsFramework;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LogManagement implements Runnable{
    private String date;
    private String PATH;

    private JavaCollectionsFramework.Watch watch = new JavaCollectionsFramework.Watch();
    private  LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public LogManagement(String date, String PATH) {
        this.date = date;
        this.PATH = PATH;
    }
    public void findAllErrorsByPath() throws IOException {

        watch.start();

        System.out.println(getDate()+".searching in log Error " + LocalTime.now());
        List<String> stringListReadAllLine = Files.readAllLines(Paths.get((this.PATH)));
        List<String> stringFind = new ArrayList<>();
        for(int i=0;i<stringListReadAllLine.size();i++)
        {
            if(stringListReadAllLine.get(i).contains("ERROR") && stringListReadAllLine.get(i).contains(this.getDate())) {
                stringFind.add(stringListReadAllLine.get(i));
                for (int j = 1; j < 10 && ((i+j) <  stringListReadAllLine.size()-1); j++)
                    stringFind.add(stringListReadAllLine.get(i + j));
            }
        }
        //.stream().filter(line -> line.contains("ERROR") && line.contains(this.getDate())).collect(Collectors.toList());
        //stringFind.stream().forEach(System.out::println);
        String stringCommaSeparated = stringFind.stream()
                .collect(Collectors.joining("\n"));
        System.out.println(getDate()+".finished searching");
        writeToFileData(stringCommaSeparated);

    }
    public void writeToFileData(String strIn)
    {
        try {
            FileWriter myWriter = new FileWriter("ERROR"+this.getDate()+".log");
            myWriter.write(strIn);
            myWriter.close();
            //watch.totalTime(getDate()+".finished wrote to the file: ");
            now = LocalDateTime.now();
            System.out.println(getDate()+ ".successfully wrote to the file "+ LocalTime.now());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LogManagement{" +
                "date='" + date + '\'' +
                ", PATH='" + PATH + '\'' +
                '}';
    }

    @Override
    public void run() {
        try {
            findAllErrorsByPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
