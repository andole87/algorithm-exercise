import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1890 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        long[][] dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }
        dp[0][0] = 1;

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (dp[y][x] == 0) {
                    continue;
                }
                int jump = map[y][x];
                if (jump == 0) {
                    continue;
                }
                if (y + jump < n) {
                    dp[y + jump][x] += dp[y][x];
                }
                if (x + jump < n) {
                    dp[y][x + jump] += dp[y][x];
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}
