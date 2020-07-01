import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11048 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        long[][] dp = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + Integer.parseInt(line[j - 1]);
            }
        }
        System.out.println(dp[n][m]);
    }
}
