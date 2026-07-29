package com.codeforces.code;

import java.io.*;

public class GrassHopper1607B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long n = Long.parseLong(s[1]);
 
            long ans;
 
            if (x % 2 == 0) {
                switch ((int) (n % 4)) {
                    case 0:
                        ans = x;
                        break;
                    case 1:
                        ans = x - n;
                        break;
                    case 2:
                        ans = x + 1;
                        break;
                    default:
                        ans = x + n + 1;
                }
            } else {
                switch ((int) (n % 4)) {
                    case 0:
                        ans = x;
                        break;
                    case 1:
                        ans = x + n;
                        break;
                    case 2:
                        ans = x - 1;
                        break;
                    default:
                        ans = x - n - 1;
                }
            }
 
            sb.append(ans).append('\n');
        }
 
        System.out.print(sb);
    }
}