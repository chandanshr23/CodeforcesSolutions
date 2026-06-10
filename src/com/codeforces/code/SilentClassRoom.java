package com.codeforces.code;

import java.util.*;

public class SilentClassRoom{
	static int pairs(int x) {
		return x*(x-1)/2;
	}
   public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
      
       int n=scan.nextInt();
       int[] names=new int[26];
       for(int i=0;i<n;i++) {
       	String s=scan.next();
       	names[s.charAt(0)-'a']++;
       }
       int ans=0;
       for(int cnt:names) {
       	int a=cnt/2;
       	int b=cnt-a;
       	ans+=pairs(a)+pairs(b);
       }
       System.out.println(ans);
   }
}