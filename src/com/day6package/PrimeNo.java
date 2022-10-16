package com.day6package;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        int i,m=0,flag=0;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        m=num/2;
        if(num==0||num==1){
            System.out.println(num+" is Not a prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println(num+" is Not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                System.out.println(num+" is prime number");
            }
        }
    }
}