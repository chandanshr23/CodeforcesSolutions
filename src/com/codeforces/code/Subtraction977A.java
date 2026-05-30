package com.codeforces.code;

import java.util.Scanner;

public class Subtraction977A {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	int f=scan.nextInt();
    	
    	while(f-->0) {
    		if(n%10==0) {
    			n/=10;
    		}
    		else if (n%10!=0) {
    			n=n-1;
    		}
    		
    	}
    	System.out.println(n);
    	   	
    }
}