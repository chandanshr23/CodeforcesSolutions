package com.codeforces.code;
import java.util.Scanner;

import com.codeforces.code.*;

public class StringLength {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int t=scan.nextInt();
       while(t-->0) {
    	   String s=scan.nextLine();
    	   if(s.length()>10) {
    		   System.out.println(s.charAt(0)+""+(s.length()-2)+s.charAt(s.length()-1));
    	   }
    	   else {
    		   System.out.println(s);
    	   }
    		   
        }
    }
}