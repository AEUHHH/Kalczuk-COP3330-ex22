package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App {

    public static boolean contain(int[] nums, int x) {

        for (int n : nums)

            if (n == x)

                return true;

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[100];

        int count = 0;

        int largest = 0;

        while (true) { // make it while(count<10) for entering 10 numbers

            System.out.print("Enter any number (-1 to stop): ");

            int x = sc.nextInt();

            if (x == -1)

                break;

            if (contain(nums, x)) {

                System.out.println("Number already entered. Please Enter a different number!!");

                continue;

            }

            nums[count++] = x;

            largest = Math.max(x, largest);

        }

        System.out.println("The largest number is " + largest+".");

        sc.close();

    }

}