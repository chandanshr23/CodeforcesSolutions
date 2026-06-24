package com.codeforces.code;
import java.util.*;
public class KefaFirstSteps {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       long[] a = new long[n];

       for (int i = 0; i < n; i++) {
           a[i] = sc.nextLong();
       }

       int curr = 1;
       int maxLen = 1;

       for (int i = 1; i < n; i++) {
           if (a[i] >= a[i - 1]) {
               curr++;
           } else {
               curr = 1;
           }

           maxLen = Math.max(maxLen, curr);
       }

       System.out.println(maxLen);
   }
}