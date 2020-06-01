import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B7569 {
    static int[][][] box;
    static int[][][] visited;
    static int m, n, h;
    static int total;
    static int[][] direction = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        h = Integer.parseInt(s[2]);
        box = new int[h][n][m];
        visited = new int[h][n][m];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    int tomato = Integer.parseInt(line[k]);
                    box[i][j][k] = tomato;
                    if (tomato == 1) {
                        q.add(new int[]{i, j, k});
                    } else if (tomato == -1) {
                        total++;
                    }
                }
            }
        }

        int size;
        int days = 0;

        while (!q.isEmpty()) {
            size = q.size();
            total += size;
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for (int j = 0; j < 6; j++) {
                    int nz = curr[0] + direction[j][0];
                    int ny = curr[1] + direction[j][1];
                    int nx = curr[2] + direction[j][2];
                    if (isValid(nz, ny, nx)) {
                        box[nz][ny][nx] = 1;
                        q.add(new int[]{nz, ny, nx});
                    }
                }
            }
            days++;
        }

        if (total == n * m * h) {
            System.out.println(days - 1);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean isValid(int nz, int ny, int nx) {
        return nz >= 0 && nz < h
                && ny >= 0 && ny < n
                && nx >= 0 && nx < m
                && box[nz][ny][nx] == 0;
    }

}
