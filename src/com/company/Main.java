package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double weeklyHours[10];
        double weeklySalary[10];
        double weeklyGross[10];
        char quit;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello welcome to Java accounting!\nPlease enter your first name:");
        String firstName = input.nextLine();
        String firstName2 = firstName.toUpperCase();

        System.out.println("Please eneter your last name:");
        String lastName = input.nextLine();
        String lastName2 = lastName.toLowerCase();

        int randomNumber = 10 + (int) (Math.random() * 90);
        char a = firstName2.charAt(firstName2.length() - 1);

        System.out.println("Your identifier is " + a + randomNumber + lastName2.substring(0, 3));

        System.out.println("This program will be able to take 10 weeks of your income and" +
                "allow you to see how much you are actually taking home each week.");

        do{
            for(int i=0; i<10; i++){
                System.out.println("How many hours are you working during Week "+(i+1)+"? Enter your answer in decimal format." +
                        "\n For example, if you worked 10.25 hours, enter '10.25'");
                weeklyHours[i] = input.nextDouble();

                System.out.println("How much money per hour did you make during Week "+(i+1)+"? Enter your answer in decimal format." +
                        "\n For example, if you make $8.25/hr this week, enter '8.25'");
                weeklySalary[i] = input.nextDouble();

                weeklyGross[i] = (weeklyHours[i] * weeklySalary[i]);


            }
        } while (quit!= 'q' && quit!='Q');





        // write your code here
    }
}
