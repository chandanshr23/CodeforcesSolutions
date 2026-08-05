package com.codeforces.code;

import java.io.*;
import java.util.*;

public class YouDeleteIDelete2248A {

    static String deleteChar(String s, int idx) {
        return s.substring(0, idx) + s.substring(idx + 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String s = br.readLine();

            String bestForAlice = null;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') continue;

                String afterAlice = deleteChar(s, i);

                String bestForBob = null;

                for (int j = 0; j < afterAlice.length(); j++) {
                    if (afterAlice.charAt(j) != '1') continue;

                    String finalString = deleteChar(afterAlice, j);

                    if (bestForBob == null || finalString.compareTo(bestForBob) < 0) {
                        bestForBob = finalString;
                    }
                }

                if (bestForAlice == null || bestForBob.compareTo(bestForAlice) > 0) {
                    bestForAlice = bestForBob;
                }
            }

            System.out.println(bestForAlice);
        }
    }
}