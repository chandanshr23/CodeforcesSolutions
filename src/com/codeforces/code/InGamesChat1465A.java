package com.codeforces.code;
import java.util.*;

public class InGamesChat1465A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int count = 0;

            for (int i = n - 1; i >= 0; i--) {

                if (s.charAt(i) == ')')
                    count++;
                else
                    break;
            }

            if (count > n - count)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}