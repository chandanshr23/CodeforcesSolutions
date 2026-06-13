package com.codeforces.code;

import java.util.Scanner;

public class BlackSquares431A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<4;i++) {
        	a[i]=scan.nextInt();
        }
        String s=scan.next();
        int ans=0;
        for(char c:s.toCharArray()) {
        	ans+=a[c-'1'];
        }
        System.out.println(ans);
    }
}	