package com.codeforces.code;

import java.io.*;
import java.util.*;

public class AvoidTrygub1450A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            char[] arr = br.readLine().toCharArray();

            Arrays.sort(arr);

            StringBuilder ans = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                ans.append(arr[i]);
            }

            System.out.println(ans);
        }
    }
}