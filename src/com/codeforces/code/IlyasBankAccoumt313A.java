package com.codeforces.code;

import java.util.Scanner;

public class IlyasBankAccoumt313A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println(n);
            return;
        }

        int option1 = n; // don't delete anything
        int option2 = n / 10; // remove last digit
        int option3 = (n / 100) * 10 + (n % 10); // remove second last digit

        int ans = Math.max(option1, Math.max(option2, option3));

        System.out.println(ans);
    }
}