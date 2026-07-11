package com.codeforces.code;

import java.io.*;
import java.util.*;

public class SubsequencePermutation1552A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != arr[i]) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}