package com.codeforces.code;

import java.util.Scanner;

public class StonesOnTheTable266A {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		int cnt=0;
		for(int i=1;i<n;i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
