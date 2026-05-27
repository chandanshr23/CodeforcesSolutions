package com.codeforces.code;

import java.util.Scanner;

public class PrependAppend {
	 public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     int t=scan.nextInt();
	     while(t-->0)
	     {
	    	 int n=scan.nextInt();
	    	 String s=scan.nextLine();
	    	 int left =0;
	    	 int right=n-1;
	    	 while(left<right &&s.charAt(left)!=s.charAt(right)){
	    		 left++;
	    		 right--;
	    	 }
	    	 int res=right-left+1;
	    	 if(res<0) res= 0;
	    	 System.out.println(res);
	     }
	    }
}
