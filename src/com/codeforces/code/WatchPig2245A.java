package com.codeforces.code;

import java.io.*;
import java.util.*;

public class WatchPig2245A {

    static final int INF = 1_000_000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine().trim();

            int answer = INF;

            // r = total number of R's in the final string
            for (int r = 0; r <= n; r++) {

                // dp[cntR] = minimum flips after processing current prefix
                int[] dp = new int[n + 1];
                Arrays.fill(dp, INF);
                dp[0] = 0;

                for (int i = 0; i < n; i++) {
                    int[] next = new int[n + 1];
                    Arrays.fill(next, INF);

                    for (int cntR = 0; cntR <= r; cntR++) {
                        if (dp[cntR] == INF)
                            continue;

                        // Put L at position i
                        // It needs at least k R's to its left.
                        if (cntR >= k) {
                            int cost = dp[cntR];

                            if (s.charAt(i) != 'L')
                                cost++;

                            next[cntR] = Math.min(next[cntR], cost);
                        }

                        // Put R at position i
                        if (cntR < r) {
                            int newCntR = cntR + 1;

                            // Number of positions after i
                            int remainingPositions = n - i - 1;

                            // R's still needed after this position
                            int remainingR = r - newCntR;

                            // Therefore L's after this position
                            int remainingL =
                                    remainingPositions - remainingR;

                            // Current R needs at least k L's to its right.
                            if (remainingL >= k) {
                                int cost = dp[cntR];

                                if (s.charAt(i) != 'R')
                                    cost++;

                                next[newCntR] =
                                        Math.min(next[newCntR], cost);
                            }
                        }
                    }

                    dp = next;
                }

                answer = Math.min(answer, dp[r]);
            }

            System.out.println(answer == INF ? -1 : answer);
        }
    }
}