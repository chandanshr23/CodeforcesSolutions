package com.codeforces.code;

import java.util.*;

public class FoodForAnimals1675A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long needDog = Math.max(0, x - a);
            long needCat = Math.max(0, y - b);

            if (needDog + needCat <= c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}