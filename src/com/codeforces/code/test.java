package com.codeforces.code;

public class ThresholdMovement2250A {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            if ((n & 1) == 1) {
                System.out.println("NO");
                continue;
            }

            long mxEven = Long.MIN_VALUE;
            long mnOdd = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                long w = Long.parseLong(st.nextToken());
                if ((i & 1) == 1) {
                    mnOdd = Math.min(mnOdd, w);
                } else {
                    mxEven = Math.max(mxEven, w);
                }
            }

            if (mxEven + 1 < mnOdd)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
