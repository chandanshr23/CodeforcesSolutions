package com.codeforces.code;


import java.util.*;

public class LuckySum121A {

    static List<Long> lucky = new ArrayList<>();

    static void generate(long x) {
        if (x > 10000000000L) return;

        lucky.add(x);
        generate(x * 10 + 4);
        generate(x * 10 + 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();

        generate(4);
        generate(7);

        Collections.sort(lucky);

        long ans = 0;
        long pos = l;

        for (long cur : lucky) {

            if (cur < pos) continue;

            long end = Math.min(r, cur);

            ans += (end - pos + 1) * cur;

            pos = end + 1;

            if (pos > r) break;
        }

        System.out.println(ans);
    }
}