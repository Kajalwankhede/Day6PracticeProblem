package com.day6package;
import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter '1' to start stopwatch!");
        int time = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch starts!");
        System.out.println("Stopwatch Started at: "+startTime);
        System.out.println("Enter '2' to stop stopwatch : ");
        time = scanner.nextInt();
        scanner.close();
        long stopTime = System.currentTimeMillis();
        System.out.println("Stopwatch Stop!");
        System.out.println("Stopwatch Stopped at : "+stopTime);
        GetElapsedTime(startTime, stopTime);
    }
    public static void GetElapsedTime(long startTime, long stopTime) {
        double elapse = stopTime - startTime;
        System.out.println("Elapsed Time:  = " + elapse);
        double seconds = elapse / 1000;
        System.out.println("Elapsed Time in seconds : " + seconds);

    }
}
