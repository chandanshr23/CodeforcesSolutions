package com.codeforces.code;

import java.util.Scanner;

public class HungryStudent903A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int x=scan.nextInt();
			while (x >= 0) {
			    if (x % 7 == 0) {
			        System.out.println("YES");
			        break;
			    }
			    x -= 3;
			}

			if (x < 0)
			    System.out.println("NO");
		}
		
	}
}
