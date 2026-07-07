package com.codeforces.code;

import java.util.Scanner;

public class PilesWithStones1013A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            y[i] = scan.nextInt();
        }

        int need = 0;
        int extra = 0;

        for (int i = 0; i < n; i++) {
            if (y[i] > x[i]) {
                need += y[i] - x[i];
            } else {
                extra += x[i] - y[i];
            }
        }

        if (extra >= need) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}