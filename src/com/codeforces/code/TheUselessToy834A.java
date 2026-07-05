package com.codeforces.code;

import java.util.*;

public class TheUselessToy834A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);

        int n = sc.nextInt() % 4;

        String order = "^>v<";

        int s = order.indexOf(start);
        int e = order.indexOf(end);

        boolean cw = ((s + n) % 4) == e;
        boolean ccw = ((s - n + 4) % 4) == e;

        if (cw && ccw)
            System.out.println("undefined");
        else if (cw)
            System.out.println("cw");
        else
            System.out.println("ccw");
    }
}