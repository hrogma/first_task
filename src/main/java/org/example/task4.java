package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("  Программа вычисляет площадь треугольника");
        System.out.println("  по трём сторонам (формула Герона).");
        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите длину стороны b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите длину стороны c: ");
        double c = scanner.nextDouble();

        scanner.close();


        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка: все стороны треугольника должны быть больше нуля.");
            return;
        }

        // Проверка: неравенство треугольника
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ошибка: стороны не удовлетворяют неравенству треугольника.");
            System.out.println("Сумма любых двух сторон должна быть больше третьей.");
            return;
        }

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("----------------------------------------");
        System.out.printf("Стороны: a = %.2f, b = %.2f, c = %.2f%n", a, b, c);
        System.out.printf("Полупериметр: p = %.4f%n", p);
        System.out.printf("Площадь треугольника: S = %.4f%n", area);
        System.out.println("----------------------------------------");
    }
}