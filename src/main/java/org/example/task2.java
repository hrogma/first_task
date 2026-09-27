package org.example;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double y;
        double expression = x * x - 4;


        y = Math.sqrt(expression) / (x - 1);
        System.out.printf("y = %.4f%n", y);


        scanner.close();
    }
}