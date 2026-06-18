package com.codeforces.code;

import java.util.Scanner;

public class Prefixes1216A {
	public static void main(String[] main) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		char[] ch=s.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i+=2) {
			if(ch[i]==ch[i+1]) {
				cnt++;
				
				if(ch[i]=='a') {
					ch[i+1]='b';
				}
				else {
					ch[i+1]='a';
				}
			}
		}
		System.out.println(cnt);
		System.out.println(ch);
	}
}
