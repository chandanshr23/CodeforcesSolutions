package com.codeforces.code;

import java.util.*;

public class DiverseSubstring1073A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n && j < i + 26; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;
                maxFreq = Math.max(maxFreq, freq[idx]);

                int len = j - i + 1;

                if (maxFreq <= len / 2) {
                    System.out.println("YES");
                    System.out.println(s.substring(i, j + 1));
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}