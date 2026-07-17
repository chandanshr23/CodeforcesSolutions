package com.codeforces.code;

import java.util.*;

public class RecentActions1799A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] ans = new int[n + 1];
            Arrays.fill(ans, -1);

            HashSet<Integer> seen = new HashSet<>();

            int distinct = 0;

            for (int time = 1; time <= m; time++) {
                int p = sc.nextInt();

                if (!seen.contains(p)) {
                    seen.add(p);
                    distinct++;

                    int removed = n - distinct + 1;
                    if (removed >= 1)
                        ans[removed] = time;
                }
            }

            for (int i = 1; i <= n; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}