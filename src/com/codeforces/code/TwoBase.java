package com.codeforces.code;

import java.util.Scanner;

public class TwoBase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bx=sc.nextInt();
        long x=convert(n,bx,sc);
        int m=sc.nextInt();
        int by=sc.nextInt();
        long y=convert(m,by,sc);
        if(x==y) {
        	System.out.println("=");
        }
        else if(x>y) {
        	System.out.println(">");
        }
        else {
        	System.out.println("<");
        }
    }
    static long convert(int len,int base,Scanner sc) {
    	long value=0;
    	for(int i=0;i<len;i++) {
    		int digits=sc.nextInt();
    		value=value*base+digits;
    	}
		return value;
    	
    }
}