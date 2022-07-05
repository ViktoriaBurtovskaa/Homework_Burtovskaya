package com.telran.alex.practice.scanner;

import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 500;
        int number2 = 125;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("500 + 125 = " + (number1 + number2));
        System.out.println("500 - 125 = " + (number1 - number2));
        scanner.close();
}
}