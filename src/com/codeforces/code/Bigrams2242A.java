package com.codeforces.code;
import java.io.*;
import java.util.*;

public class Bigrams2242A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int countTwoOrMore = 0;
            boolean possible = false;

            for (int i = 0; i < k; i++) {
                int c = Integer.parseInt(st.nextToken());

                if (c >= 3) {
                    possible = true;
                }

                if (c >= 2) {
                    countTwoOrMore++;
                }
            }

            if (countTwoOrMore >= 2) {
                possible = true;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}