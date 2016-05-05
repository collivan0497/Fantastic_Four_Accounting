package com.company;

public class Bank
{
    public static String account(String num)
    {
        return ("\nYour Bank Account is with " + num);
    }

    public static String account(int num) {
        return ("\nYour Account Number is " + num);
    }

    public static String account(double num) {
        return ("\nYour Routing Number is " + num);
    }

    public static String passWord(String a)
    {
        return (a);
    }
}