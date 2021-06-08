package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 5, 7, 9, 9, 8};
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        number = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        System.out.println("số [" + number + "] xuất hiện: " + count + " lần");
    }
}
