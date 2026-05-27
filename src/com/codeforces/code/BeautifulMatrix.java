package com.codeforces.code;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int row=0,col=0;
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=5;j++) {
				 int n=scan.nextInt();
				 if(n==1) {
					 row=i;
					 col=j;
				 }
			 }
		 }
		 int centre=Math.abs(row-3)+Math.abs(col-3);
		 System.out.println(centre);

	}

}
