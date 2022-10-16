package com.day6package;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("\nHow many Elements you want to print in Fibonacci series: ");
        int n=sc.nextInt();
        System.out.println("\nFibonacci Series");
        System.out.println(first+ " \n" +second+ " ");
        int next;
        for (int i=2;i<n;i++)
        {
            next=first+second;
            System.out.println(next+"");
            first=second;
            second=next;
        }

    }
}
