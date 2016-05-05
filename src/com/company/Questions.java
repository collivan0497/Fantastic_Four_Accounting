package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Questions extends Bank
{
    private static double[] weeklyHours = new double[5];
    private static double[] weeklySalary = new double[5];
    private static double[] weeklyGross = new double[5];
    private static double[] weeklySavings = new double[5];
    private static double[] weeklyNet = new double[5];
    private static double[] weeklyExpenses = new double[50];

    public static void main (String[] args)
    {

        double grossTOTAL = 0;
        double grossSAVING = 0;
        double grossNET = 0;

        char quit;

        NumberFormat currFormat = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        Password myPassword = new Password();   // Create an myPassword object for Password Class
        myPassword.callPassword();  // Calls the callPassword  method from Password Class

        // Extends Bank
        System.out.println(account("PNC Bank"));
        System.out.println(account(11100088));
        System.out.println(account(123.456));

        System.out.println("\nThis program will be able to take 1 month (4 weeks) of your income and " +
                "allow you to see how much you are actually taking home at the end of the month. \n");
        // "Kyong Kang" added doWhile loop so the program keep repeating until n/N is pressed
        do
        {
            questions();
            for (int i = 0; i < weeklyGross.length; i++) {
                grossTOTAL += weeklyGross[i];
            }
            for (int i = 0; i < weeklySavings.length; i++) {
                grossSAVING += weeklySavings[i];
            }
            for (int i = 0; i < weeklyNet.length; i++) {
                grossNET += weeklyNet[i];
            }
            System.out.println("This month's gross is " + currFormat.format(grossTOTAL) + "\n This month you saved " +
                    currFormat.format(grossSAVING) + "\n This month you netted " + currFormat.format(grossNET));


            System.out.println();
            System.out.println(" Would you like to enter another month's information?\n If yes, press 'y' or 'Y'. If no, press 'n' or 'N'");
            String quit1 = input.nextLine();
            quit = quit1.charAt(0);
        }   while (quit !='n' && quit !='N');
        System.out.println("Thanks for using this program. Goodbye");
    }

    public static void questions()
    {
        for (int i = 0; i < 4; i++) {

            Scanner input1 = new Scanner(System.in);

            System.out.println("If a non-number is entered, the program will wait until a valid numerical input is presented");
            System.out.println();

            System.out.println("(Q1/4) How many hours are you working during Week " + (i + 1) + "? Enter your answer in decimal format." +
                    "\nFor example, if you worked 10.25 hours, enter '10.25'");
            while (!input1.hasNextDouble()) input1.next();
            weeklyHours[i] = input1.nextDouble();

            System.out.println("(Q2/4) How much money per hour did you make during Week " + (i + 1) + "? Enter your answer in decimal format." +
                    "\nFor example, if you make $8.25/hr this week, enter '8.25'");
            while (!input1.hasNextDouble()) input1.next();
            weeklySalary[i] = input1.nextDouble();

            weeklyGross[i] = (weeklyHours[i] * weeklySalary[i]);
            weeklyNet[i] = weeklyGross[i];

            System.out.println("(Q3/4) What percent of your income during Week " + (i + 1) + " would you like to save? Enter your answer in decimal format." +
                    "\nFor example, if you want to save 15%, enter '0.15'");
            while (!input1.hasNextDouble()) input1.next();
            weeklySavings[i] = (weeklyGross[i] * input1.nextDouble());
            weeklyNet[i] = (weeklyGross[i] - weeklySavings[i]);

            System.out.println("(Q4/4) How much money during Week " + (i + 1) + " have you spent on other expenses? Enter your answer in decimal format." +
                    "\nFor example, if you spent to save $100.00, enter '100.00'");
            while (!input1.hasNextDouble()) input1.next();
            weeklyExpenses[i] = input1.nextDouble();
            weeklyNet[i] -= weeklyExpenses[i];
        }
    }
}