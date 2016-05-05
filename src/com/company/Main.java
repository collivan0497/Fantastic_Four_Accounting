package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] weeklyHours = new double[10];
        double[] weeklySalary = new double[10];
        double[] weeklyGross = new double[10];
        double[] weeklySavings = new double[10];
        double[] weeklyNet = new double[10];
        double[] weeklyExpenses = new double[10];

        Bank bank1 = new Bank();

        char repeat = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello welcome to Java accounting!\nPlease enter your first name:");
        String firstName = input.nextLine();
        String firstName2 = firstName.toUpperCase();

        System.out.println("Please eneter your last name:");
        String lastName = input.nextLine();
        String lastName2 = lastName.toLowerCase();

        System.out.println(bank1.account("PNC Bank"));
        System.out.println(bank1.account(11100088));
        System.out.println(bank1.account(123.456));

        int randomNumber = 10 + (int) (Math.random() * 90);
        char a = firstName2.charAt(firstName2.length() - 1);

        System.out.println("Your identifier is " + a + randomNumber + lastName2.substring(0, 3));

        System.out.println("This program will be able to take 1 month (4 weeks) of your income and " +
                "allow you to see how much you are actually taking home at the end of the month.");

        for (int i = 0; i < 4; i++) {
            System.out.println("(Q1/4) How many hours are you working during Week " + (i + 1) + "? Enter your answer in decimal format." +
                    "\nFor example, if you worked 10.25 hours, enter '10.25'");
            weeklyHours[i] = input.nextDouble();

            System.out.println("(Q2/4) How much money per hour did you make during Week " + (i + 1) + "? Enter your answer in decimal format." +
                    "\nFor example, if you make $8.25/hr this week, enter '8.25'");
            weeklySalary[i] = input.nextDouble();

            weeklyGross[i] = (weeklyHours[i] * weeklySalary[i]);
            weeklyNet[i] = weeklyGross[i];

            System.out.println("(Q3/4) What percent of your income during Week " + (i + 1) + " would you like to save? Enter your answer in decimal format." +
                    "\nFor example, if you want to save 15%, enter '0.15'");
            weeklySavings[i] = (weeklyGross[i] * input.nextDouble());
            weeklyNet[i] = (weeklyGross[i] - weeklySavings[i]);

            System.out.println("(Q4/4) How much money during Week " + (i + 1) + " have you spent on other expenses? Enter your answer in decimal format." +
                    "\nFor example, if you spent to save $100.00, enter '100.00'");
            weeklyExpenses[i] = input.nextDouble();
            weeklyNet[i] = -weeklyExpenses[i];

        }


    }


}
