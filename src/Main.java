
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++) {
        	if((arr[i]==arr[i+1] )&& arr[i]!=arr[i+1]) {
        		arr1[i]=arr[i];
        	}
        }
        System.out.println(arr1.length);
        System.out.println(arr);
    }
}
