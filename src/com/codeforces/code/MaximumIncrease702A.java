package com.codeforces.code;

import java.util.*;

public class MaximumIncrease702A{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int current = 1;
        int ans = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i - 1]) {
                current++;
            } else {
                current = 1;
            }

            ans = Math.max(ans, current);
        }

        System.out.println(ans);
    }
}