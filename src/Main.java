import java.util.*;

public class Main {
    public static void main(String[] args) {
    	  Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();
          int k=scan.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=scan.nextInt();
              
          }
          int left=0;
          int right=n-1;
          int count=0;
          while(left<=right) {
        	  while(left<=right && arr[left]<=k) {
        		  count++;
        		  left++;
        	  }
        	  while(left<=right && arr[right]<=k) {
        		  count++;
        		  right--;
        	  }
        	  if (left <= right && arr[left] > k && arr[right] > k) {
        	        break;
        	    }
          }
          System.out.println(count);
          
    }
}