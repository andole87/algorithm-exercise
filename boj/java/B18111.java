import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B18111 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int time = Integer.MAX_VALUE;
        int maxH = 0;

        int[][] mine = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int t = Integer.parseInt(line[j]);
                mine[i][j] = t;
                if (t > max) {
                    max = t;
                } else if (t < min) {
                    min = t;
                }
            }
        }

        for (int h = min; h <= max; h++) {
            int build = 0;
            int remove = 0;
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    int height = mine[y][x] - h;
                    if (height > 0) {
                        remove += height;
                    } else if (height < 0) {
                        build -= height;
                    }
                }
            }
            if (remove + b >= build) {
                int t = remove * 2 + build;
                if (time >= t) {
                    time = t;
                    maxH = h;
                }
            }
        }
        System.out.println(time + " " + maxH);
    }
}
