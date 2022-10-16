package com.day6package;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num,reverse=0;
        System.out.println("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
        while(num!=0){
            int rem = num % 10;
            reverse=reverse * 10 +rem;
            num=num/10;
        }
        System.out.println("The reverse of the entered Number is: "+reverse);
    }
}
