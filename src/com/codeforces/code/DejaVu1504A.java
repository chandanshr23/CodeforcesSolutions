package com.codeforces.code;

import java.io.*;
import java.util.*;

public class DejaVu1504A {

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();

            boolean allA = true;
            for (char c : s.toCharArray()) {
                if (c != 'a') {
                    allA = false;
                    break;
                }
            }

            if (allA) {
                System.out.println("NO");
                continue;
            }

            String front = "a" + s;

            if (!isPalindrome(front)) {
                System.out.println("YES");
                System.out.println(front);
            } else {
                System.out.println("YES");
                System.out.println(s + "a");
            }
        }
    }
}