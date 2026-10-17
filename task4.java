package org.example;

import java.util.Scanner;

public class task4 {
        public static void printMatrix(double[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("введите M: ");
            int m = scanner.nextInt();

            System.out.print("введите N: ");
            int n = scanner.nextInt();

            System.out.print("введите D: ");
            double d = scanner.nextDouble();
            
            double[][] matrix = new double[m][n];
            
            System.out.println("введите " + n + " чисел:");
            for (int j = 0; j < n; j++) {
                matrix[0][j] = scanner.nextDouble();
            }
            
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = matrix[i - 1][j] * d;
                }
            }
            
            System.out.println("матрица " + m + "x" + n + ":");
            printMatrix(matrix);
        }
    }

