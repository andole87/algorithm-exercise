import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            solution(br);
        }
    }

    private static void solution(BufferedReader br) throws IOException {
        int m = Integer.parseInt(br.readLine());
        Sticker[] stickers = new Sticker[m];
        int[][] dp = new int[m][2];

        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            stickers[i] = new Sticker(Integer.parseInt(s1[i]), Integer.parseInt(s2[i]));

            int upper = stickers[i].getUpper();
            int lower = stickers[i].getLower();
            if (i == 0) {
                dp[i][0] = upper;
                dp[i][1] = lower;
            } else if (i == 1) {
                dp[i][0] = dp[0][1] + upper;
                dp[i][1] = dp[0][0] + lower;
            } else {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 2][1]) + upper;
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 2][0]) + lower;
            }
        }
        System.out.println(Math.max(dp[m - 1][0], dp[m - 1][1]));
    }

    private static class Sticker {
        private int upper;
        private int lower;

        public Sticker(int upper, int lower) {
            this.upper = upper;
            this.lower = lower;
        }

        public int getUpper() {
            return upper;
        }

        public int getLower() {
            return lower;
        }

        @Override
        public String toString() {
            return "Sticker{" +
                    "upper=" + upper +
                    ", lower=" + lower +
                    '}';
        }
    }
}
