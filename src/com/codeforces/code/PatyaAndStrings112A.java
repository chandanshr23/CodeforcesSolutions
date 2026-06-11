package com.codeforces.code;

import java.util.Scanner;

public class PatyaAndStrings112A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s=scan.nextLine().toLowerCase();
        String t=scan.nextLine().toLowerCase();
        int res=s.compareTo(t);
        	if( res>=1) {
        		System.out.println("1");
        	}
        	else if(res<0) {
        		System.out.println("-1");
        	}
        	else {
        		System.out.println("0");
        	}
        }
}