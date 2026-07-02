package com.codeforces.code;
import java.util.*;

public class Sorabon363A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("O-|-OOOO");
            return;
        }

        while (n > 0) {
            int d = n % 10;

            StringBuilder sb = new StringBuilder();

            if (d < 5)
                sb.append("O-|");
            else
                sb.append("-O|");

            int k = d % 5;

            for (int i = 0; i < k; i++)
                sb.append('O');

            sb.append('-');

            for (int i = 0; i < 4 - k; i++)
                sb.append('O');

            System.out.println(sb);

            n /= 10;
        }
    }
}