package com.codeforces.code;
import java.util.Scanner;

public class EqualCandies1676B {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0) {
    		int n=sc.nextInt();
    		int[] arr=new int[n];
    		int min=Integer.MAX_VALUE;
    		int sum=0;
    		 for (int i = 0; i < n; i++) {

                 arr[i] = sc.nextInt();

                 min = Math.min(min, arr[i]);
             }

             for (int i = 0; i < n; i++) {

                 sum += arr[i] - min;
             }

             System.out.println(sum);
    	}
    	
    }
}