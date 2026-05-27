package com.codeforces.code;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();
	        int k = scan.nextInt();

	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }

	        int kthScore = arr[k - 1];

	        int count = 0;

	        for (int i = 0; i < n; i++) {
	            if (arr[i] >= kthScore && arr[i] > 0) {
	                count++;
	            }
	        }

	        System.out.println(count);

	}

}
