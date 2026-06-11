	package com.codeforces.code;

import java.util.Scanner;

public class Drinks200B {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }

        double avg = sum / n;

        System.out.printf("%.12f%n", avg);
    }
}
