package com.codeforces.code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
	 public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();

	        Set<Character> set = new HashSet<>();

	        for(char c : s.toCharArray()) {
	            set.add(c);
	        }

	        if(set.size() % 2 == 0) {
	            System.out.println("CHAT WITH HER!");
	        } else {
	            System.out.println("IGNORE HIM!");
	        }
	    }
}
