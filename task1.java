package org.example;

import java.util.Scanner;

import static org.example.task2.scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("введите четное число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i ++){
            System.out.println("введите число");
            int c = scanner.nextInt();
            a[i] = c;
        }
        for (int i = 1; i < n; i += 2){
            System.out.print(a[i] + " ");
        }
    }
}
