import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1018 {
    private static final int[][] BOARD = new int[50][50];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] f = br.readLine().split(" ");
        int n = Integer.parseInt(f[0]);
        int m = Integer.parseInt(f[1]);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                BOARD[i][j] = line.charAt(j) == 'B' ? 1 : -1;
            }
        }
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int diff = diff(i, j);
                ans = Math.min(ans, diff);
            }
        }
        System.out.println(ans);
    }

    public static int diff(int n, int m) {
        int ans = 0;
        for (int i = n; i < n + 8; i++) {
            for (int j = m; j < m + 8; j++) {
                int b = BOARD[i][j];
                if ((i + j) % 2 == 0 && b != -1) {
                    ans++;
                } else if ((i + j) % 2 == 1 && b != 1) {
                    ans++;
                }
            }
        }
        return Math.min(64 - ans, ans);
    }
}
