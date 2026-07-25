import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (i % 2 == 0) { // odd position in 1-based indexing
                    ans = Math.max(ans, x);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}