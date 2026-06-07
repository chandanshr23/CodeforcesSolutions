package com.codeforces.code;

import java.util.*;

public class GeorgeAndAccomadation467A{
	
    public static  void main(String[] args){
    	
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int cnt=0;
        while(n-->0)
        {
            int p=scan.nextInt();
            int q=scan.nextInt();
            if((q-p)>=2){
               cnt++;
            }
        }
        System.out.println(cnt);
    }
}