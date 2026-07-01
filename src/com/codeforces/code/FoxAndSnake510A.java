package com.codeforces.code;

import java.util.*;

public class FoxAndSnake510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Odd rows (1st, 3rd, 5th...)
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            // Even rows where # is at the right end
            else if (i % 4 == 1) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            }
            // Even rows where # is at the left end
            else {
                System.out.print("#");
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }
}