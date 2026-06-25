package com.codeforces.code;

import java.util.*;

public class SagheerCrossRoads812A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {

            if (a[i][3] == 1 && (
                    a[i][0] == 1 ||                 // own left
                    a[i][1] == 1 ||                 // own straight
                    a[i][2] == 1 ||                 // own right
                    a[(i + 1) % 4][0] == 1 ||      // next road left
                    a[(i + 2) % 4][1] == 1 ||      // opposite road straight
                    a[(i + 3) % 4][2] == 1         // previous road right
            )) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}