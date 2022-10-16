package com.day6package;

import java.util.Scanner;

public class StopWatch {
    long StartTimer=0;
    long StopTimer=0;
    long Elapsed;
    public void start(){
        Scanner sc=new Scanner(System.in);
        StartTimer=System.currentTimeMillis();
        System.out.println("Start Time is : "+StartTimer);
    }
    public void stop(){
       StopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is : "+StopTimer);
    }

    public long GetElapsedTime() {
        Elapsed=StopTimer-StartTimer;
        return Elapsed;
    }

    public static void main(String[] args) throws Exception{
        StopWatch SW=new StopWatch();
        System.out.println(" Start Time:");
        SW.start();
        System.out.println();
        System.out.println(" Stop Time:");
        SW.stop();
        long l=SW.GetElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in Millisec) is: " +l);
        System.out.println();
        System.out.println("Converting Millisec to Econds: " +(l/1000)+" Sec");;

    }
}
