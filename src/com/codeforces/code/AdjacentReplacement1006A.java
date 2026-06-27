package com.codeforces.code;

import java.util.*;

public class AdjacentReplacement1006A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0)
                x--;

            System.out.print(x + " ");
        }
    }
}