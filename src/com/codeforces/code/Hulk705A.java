package com.codeforces.code;
import java.util.Scanner;

public class Hulk705A {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int n =scan.nextInt();
    	for(int i=1;i<=n;i++) {
    		if(i%2==1) {
    			System.out.print("I hate ");
    		}
    		else {
    			System.out.print("I love ");
    		}
    		if(i==n) {
    			System.out.print("it");
    		}
    		else {
    			System.out.print("that ");
    		}
    	}
    	
    }
}