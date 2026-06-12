package com.codeforces.code;


import java.util.*;

public class VanyaAndCubes492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int level = 0;
        int used = 0;

        while (true) {
            level++;

            used += level * (level + 1) / 2;

            if (used > n) {
                System.out.println(level - 1);
                break;
            }
        }
    }
}