package org.example;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double y;
        double expression = x * x - 4;

        if (expression < 0) {
            System.out.println("Функция не определена: подкоренное выражение отрицательное");
        } else if (x == 1) {
            System.out.println("Функция не определена: деление на ноль");
        } else {
            y = Math.sqrt(expression) / (x - 1);
            System.out.printf("y = %.4f%n", y);
        }

        scanner.close();
    }
}