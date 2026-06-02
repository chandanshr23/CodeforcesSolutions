package com.codeforces.code;

import java.util.*;

public class FoxAndBox388A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        List<Integer> piles = new ArrayList<>();

        for (int strength : x) {

            int idx = -1;

            for (int i = 0; i < piles.size(); i++) {
                if (piles.get(i) <= strength) {
                    idx = i;
                }
            }

            if (idx == -1) {
                piles.add(1);
            } else {
                piles.set(idx, piles.get(idx) + 1);
            }
        }

        System.out.println(piles.size());
    }
}