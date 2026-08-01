package com.codeforces.code;
import java.io.*;
import java.util.*;

public class AnnoyingTheGhost2237B {

    static final long INF = (long) 4e18;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int n = Integer.parseInt(br.readLine());

            long[] a = new long[n + 1];
            long[] b = new long[n + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                a[i] = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                b[i] = Long.parseLong(st.nextToken());

            long[][] dp = new long[n + 1][n + 1];

            for (int i = 0; i <= n; i++)
                Arrays.fill(dp[i], INF);

            for (int j = 1; j <= n; j++) {
                if (a[1] <= b[j])
                    dp[1][j] = j - 1;
            }

            for (int i = 2; i <= n; i++) {
                long best = INF;

                for (int j = 1; j <= n; j++) {

                    if (best != INF)
                        best = Math.min(best, dp[i - 1][j]);

                    if (j > 1)
                        best = Math.min(best, dp[i - 1][j - 1]);

                    if (a[i] <= b[j]) {
                        for (int k = 1; k < j; k++) {
                            if (dp[i - 1][k] == INF) continue;
                            dp[i][j] = Math.min(dp[i][j],
                                    dp[i - 1][k] + (j - k - 1));
                        }
                    }
                }
            }

            if (dp[n][n] >= INF / 2)
                System.out.println(-1);
            else
                System.out.println(dp[n][n]);
        }
    }
}