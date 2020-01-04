package com.qa.homework2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task #1");

        int Number = 379;
        int NumberOfHundreds = Number / 100;
        int NumberOfDecades = Number % 100 / 10;
        int NumberOfOnes = Number % 100 % 10;
        int ReversedNumber = NumberOfOnes * 100 + NumberOfDecades * 10 + NumberOfHundreds;
        int Result = Number - ReversedNumber;
        System.out.println("NumberOfHundreds: " + NumberOfHundreds);
        System.out.println("NumberOfOnes: " + NumberOfOnes);
        System.out.println("NumberOfDecades: " + NumberOfDecades);
        System.out.println("ReversedNumber: " + ReversedNumber);
        System.out.println(Number + " - " + ReversedNumber + " = " + Result);

        System.out.println("Task #2");

        double Pounds = 15;
        int Kilos = (int) (Pounds * 0.4536);
        int Grams = (int) (((Pounds * 0.4536) - Kilos) * 1000);
        System.out.println("Amount of kilos: " + Kilos);
        System.out.println("Amount of grams: " + Grams);

        System.out.println("Task #3");

        double DepositBody= 10000;
        int DepositLength = 6;
        int DepositStart = 1;
        int DepositInterest = 15;
        int[] DaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int SumOfDays = DaysInMonth[0] + DaysInMonth[1] + DaysInMonth[2] + DaysInMonth[3] + DaysInMonth[4] + DaysInMonth[5];
        double DepositProfit = DepositBody * SumOfDays /365 * DepositInterest/100;
        System.out.println("DepositProfit: " + DepositProfit + " UAH");
    }
}
