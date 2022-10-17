package com.day6package;
import java.util.Random;
import java.util.Scanner;
public class CouponNumbers {
   public static void main(String[] args) {
        System.out.println("How many random numbers need to generate a distinct coupon number: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.close();
        int randomNum = 0;
        int arr[] = new int[length];
        Random coupon = new Random();
        boolean flag;
        for (int i = 0; i < length; i++)
        {
            randomNum = coupon.nextInt(20);
            flag = present(arr, randomNum);
            if (flag != true)
            {
                arr[i] = randomNum;
            }
            else
            {
                --i;
            }
        }
        System.out.println("The random numbers generated: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    public static boolean present(int[] arr, int randomNum) {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == randomNum)
            {
                return true;
            }
        }
        return false;
    }
}
