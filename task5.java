package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class task5 {

    static Scanner scanner = new Scanner(System.in);


    static void showMenu() {
        System.out.println("\n===== ГЛАВНОЕ МЕНЮ =====");
        System.out.println("1. Выполнить расчёт площади треугольника");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт: ");
    }

    static void showProgramInfo() {
        System.out.println("\n--- О программе ---");
        System.out.println("Программа вычисляет площадь прямоугольного треугольника.");
        System.out.println("Формула: S = a * h / 2");
        System.out.println("где a — основание, h — высота.");
    }

    static void showDeveloperInfo() {
        System.out.println("\n--- О разработчике ---");
        System.out.println("Разработчик: Зенкина Анна");
        System.out.println("Группа: РИ-250931");
        System.out.println("Год: 2026");
    }


    static void input(double[] params) {
        System.out.println("\n--- Расчёт площади прямоугольного треугольника ---");

        params[0] = readPositiveDouble("Введите основание (a > 0): ");
        params[1] = readPositiveDouble("Введите высоту (h > 0): ");
    }

    static boolean validate(double[] params) {
        if (params[0] <= 0 || params[1] <= 0) {
            System.out.println("Ошибка: основание и высота должны быть больше нуля!");
            return false;
        }
        return true;
    }

    static void calculate(double[] params) {
        if (!validate(params)) {
            return;
        }
        params[2] = params[0] * params[1] / 2;
    }

    static void output(double[] params) {
        if (params[2] == 0) {
            System.out.println("Сначала выполните расчёт!");
            return;
        }
        System.out.println("\n--- Результат ---");
        System.out.println("Параметры: " + Arrays.toString(params));
        System.out.println("Основание a = " + params[0]);
        System.out.println("Высота h = " + params[1]);
        System.out.println("Площадь S = " + params[2]);
    }


    static double readPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Число должно быть больше нуля! Попробуйте снова.");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Ввод отменён.");
                    return -1;
                }
                System.out.println("Вы ввели не число! Попробуйте снова (или введите 'exit' для отмены).");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Привет. Это программа для вычисления площади прямоугольного треугольника.");

        double[] params = new double[3];

        while (true) {
            showMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Нужно ввести число от 1 до 4!");
                scanner.next();
                continue;
            }

            int command = scanner.nextInt();

            switch (command) {
                case 1 -> {
                    input(params);
                    calculate(params);
                    output(params);
                }
                case 2 -> {
                    showProgramInfo();
                }
                case 3 -> {
                    showDeveloperInfo();
                }
                case 4 -> {
                    System.out.println("Пока!");
                    return;
                }
                default -> {
                    System.out.println("Неверный пункт меню! Введите число от 1 до 4.");
                }
            }
        }
    }
}
