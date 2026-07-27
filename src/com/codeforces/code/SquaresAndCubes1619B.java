package com.codeforces.code;
import java.util.*;

public class SquaresAndCubes1619B {

    static long cubeRoot(long n) {
        long x = (long) Math.cbrt(n);
        while ((x + 1) * (x + 1) * (x + 1) <= n) x++;
        while (x * x * x > n) x--;
        return x;
    }

    static long sixthRoot(long n) {
        long x = (long) Math.pow(n, 1.0 / 6);
        while (Math.pow(x + 1, 6) <= n) x++;
        while (Math.pow(x, 6) > n) x--;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long squares = (long) Math.sqrt(n);
            long cubes = cubeRoot(n);
            long sixth = sixthRoot(n);

            System.out.println(squares + cubes - sixth);
        }

        sc.close();
    }
}