package com.codeforces.code;

import java.util.*;
public class ArrivalOfTheGeneral144A{
	
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int maxVal=arr[0];
        int minVal=arr[0];
        for(int x:arr){
            maxVal=Math.max(maxVal,x);
            minVal=Math.min(minVal,x);
        }
        int maxPos=0;
        int minPos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==maxVal){
                maxPos=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==minVal){
               
                    minPos=i;
                    break;
               
            }
        }
        int ans=maxPos+(n-1-minPos);
        if(maxPos>minPos){
            ans--;
        }
        System.out.println(ans);
        
        
    }
}