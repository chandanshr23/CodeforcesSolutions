package com.codeforces.code;

import java.util.*;

public class ArpaHardExam742A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int[] ans = {6, 8, 4, 2};

        System.out.println(ans[(int)(n % 4)]);
    }
}