import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(in);
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(in);
            int m = nextInt(in);

            long[] prefix = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                long ai = nextInt(in);
                prefix[i] = prefix[i - 1] + ai;
            }

            int[] b = new int[m];
            for (int i = 0; i < m; i++) b[i] = nextInt(in);
            Arrays.sort(b);

            long ans = prefix[n] - prefix[b[m - 1]]; // fixed tail beyond max b
            int prev = 0;
            for (int i = 0; i < m; i++) {
                int c = b[i];
                long seg = prefix[c] - prefix[prev];
                ans += Math.abs(seg);
                prev = c;
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        boolean neg = false;
        while (b != '-' && (b < '0' || b > '9')) {
            b = in.read();
        }
        if (b == '-') {
            neg = true;
            b = in.read();
        }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }
}