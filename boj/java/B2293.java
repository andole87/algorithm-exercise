import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2293 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coins);
        long[] dp = new long[k + 1];
        for (int i = 0; i < n; i++) {
            dp[coins[i]]++;
        }

        for (int i = n; i > 0; i--) {

        }

    }
}
