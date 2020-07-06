import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B13699 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[36];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for (int i = 4; i <= n; i++) {
            long sum = 0;
            for (int j = 0; j < i; j++) {
                sum += dp[i - j - 1] * dp[j];
            }
            dp[i] = sum;
        }
        System.out.println(dp[n]);
    }
}
