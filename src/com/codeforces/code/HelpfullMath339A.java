package com.codeforces.code;

import java.util.Scanner;

public class HelpfullMath339A {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         String s = sc.next();

         int[] cnt = new int[4];

         for (char ch : s.toCharArray()) {
             if (ch != '+') {
                 cnt[ch - '0']++;
             }
         }

         StringBuilder ans = new StringBuilder();

         for (int i = 1; i <= 3; i++) {
             while (cnt[i]-- > 0) {
                 if (ans.length() > 0) {
                     ans.append("+");
                 }
                 ans.append(i);
             }
         }

         System.out.println(ans);

	}

}
