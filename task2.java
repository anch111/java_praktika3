package org.example;

import java.util.Scanner;



public class task2 {
    public static void main(String[] args) {
        int[] a = {2,2, 3, 4, 5, 6,6, 7};
        int count = 1;

        for (int i = 1; i < a.length; i++){
            if (a[i] != a[i-1]) {
                count ++;

            }
        }
        System.out.println(count);
    }


}
