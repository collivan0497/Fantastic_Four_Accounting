package com.company;

import java.util.Scanner;

public class Password extends Bank
{
    public static void callPassword()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello welcome to Java accounting!");
        //Extends
        System.out.println(passWord("\nWe are going to create your password"));
        System.out.println("\nPlease enter your first name:");
        String firstName = input.nextLine();
        String firstName2 = firstName.toUpperCase();

        System.out.println("Please eneter your last name:");
        String lastName = input.nextLine();
        String lastName2 = lastName.toLowerCase();

        int randomNumber = 10 + (int) (Math.random() * 90);
        char a = firstName2.charAt(firstName2.length() - 1);

        System.out.println("Your identifier is " + a + randomNumber + lastName2.substring(0, 3));
    }
}