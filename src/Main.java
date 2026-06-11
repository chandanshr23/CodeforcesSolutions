import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        int[] arr=new int[n];
        double sum=0;
        for(int i=0;i<n;i++) {
        	arr[i]=scan.nextInt();
        	sum+=arr[i];
        }
        
        sum=sum/n;
        System.out.println(sum);
        }
}