package com.codeforces.code;

import java.util.*;

public class BearAndBigBrother{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       
        int a=scan.nextInt();//4
        int b=scan.nextInt();//7
        int cnt=0;
        while(b>=a) {//18>12
        	
        		a=a*3;//18*3=12
        		b=b*2;//9*2=18
        		cnt++;//1
        	
        }
        System.out.println(cnt);
    }
}
