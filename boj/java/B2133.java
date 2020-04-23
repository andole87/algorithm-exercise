import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2133 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 3;
        if (n % 2 != 0) {
            System.out.println("0");
        } else {
            n = n / 2;
            for (int i = 2; i <= n; i++) {
                dp[i] = 3 * dp[i - 1];
                for (int j = 2; i - j >= 0; j++) {
                    dp[i] += 2 * dp[i - j];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
