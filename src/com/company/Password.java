package com.company;

import java.util.Scanner;

/**
 * Created by csullivan on 5/4/16.
 */
public class Password {

    Scanner input = new Scanner(System.in);
    char quit;

    public Password() {

        do {
            System.out.println("Welcome to Java Accounting!");
            System.out.println("In order to make your password, you must put in you first and last name.");
            System.out.println("Please enter your first name ");
            String firstName = input.nextLine();
            String firstName2 = firstName.toUpperCase();

            System.out.println("Please enter your last name ");
            String lastName = input.nextLine();
            String lastName2 = lastName.toLowerCase();

            int randomNumber = 10 + (int) (Math.random() * 90);

            char a = firstName2.charAt(firstName2.length() - 1);

            System.out.println("Your password is " + a + randomNumber + lastName2.substring(0, 3));

        } while (quit != 'Q' && quit != 'q');
        System.out.println("Thanks for using this program. Goodbye.");
    }
}
