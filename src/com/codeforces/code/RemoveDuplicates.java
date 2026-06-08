package com.codeforces.code;
import java.util.*;

public class RemoveDuplicates{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        	
        }
        HashSet<Integer> seen=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--) {
        	if(seen.add(arr[i])) {
        		ans.add(arr[i]);
        	}
        }
        Collections.reverse(ans);
        for(int x:ans) {
        	System.out.print(x+ " ");
        }
    }
}
