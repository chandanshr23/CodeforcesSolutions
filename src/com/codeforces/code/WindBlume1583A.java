
import java.util.*;

public class WindBlume1583A {

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];

            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            // If total sum is composite
            if (!isPrime(sum)) {

                System.out.println(n);

                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }

                System.out.println();
            }
            else {

                // Remove one odd element
                List<Integer> ans = new ArrayList<>();

                int remove = -1;

                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 1) {
                        remove = i;
                        break;
                    }
                }

                for (int i = 0; i < n; i++) {
                    if (i != remove) {
                        ans.add(i + 1);
                    }
                }

                System.out.println(ans.size());

                for (int x : ans) {
                    System.out.print(x + " ");
                }

                System.out.println();
            }
        }
    }
}