package com.codeforces.code;

import java.util.*;

public class FairGames864A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        if (map.size() != 2) {
            System.out.println("NO");
            return;
        }

        List<Integer> nums = new ArrayList<>(map.keySet());

        int a = nums.get(0);
        int b = nums.get(1);

        if (map.get(a) == map.get(b)) {
            System.out.println("YES");
            System.out.println(a + " " + b);
        } else {
            System.out.println("NO");
        }
    }
}