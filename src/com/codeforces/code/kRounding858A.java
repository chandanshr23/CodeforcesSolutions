package com.codeforces.code;

import java.util.*;

public class kRounding858A{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       
        long n=scan.nextLong();
        long k=scan.nextLong();
        long x=n;
        while(k>0 && x%10!=0) {
        	if(x%2!=0) {
        		x*=2;
        	}
        	else if(x%5!=0) {
        		x*=5;
        	}
        	k--;
        }
        while(k-->0) {
        	x*=10;
        }
        System.out.println(x);
    }
}
