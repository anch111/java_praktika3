package org.example;

public class task3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[a.length];

        int j = 0;

        for (int i=1; i < a.length; i+=2){
            b[j] = a[i];
            j++;
        }

        for (int i=0; i < a.length; i+=2){
            b[j] = a[i];
            j++;
        }

        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
