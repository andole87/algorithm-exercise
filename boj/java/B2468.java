import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2468 {
    private static final int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                int k = Integer.parseInt(line[j]);
                if (max < k) {
                    max = k;
                } else if (min > k) {
                    min = k;
                }
                map[i][j] = k;
            }
        }

        int safe = 0;
        int check = 0;

        for (int rain = min - 1; rain < max; rain++) {
            check = 0;
            boolean[][] visited = new boolean[n][n];
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < n; x++) {
                    if (map[y][x] > rain && !visited[y][x]) {
                        check++;
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[]{y, x});
                        visited[y][x] = true;
                        while (!q.isEmpty()) {
                            int[] curr = q.poll();
                            for (int i = 0; i < 4; i++) {
                                int ny = curr[0] + dir[i][0];
                                int nx = curr[1] + dir[i][1];
                                if (nx >= 0 && nx < n
                                        && ny >= 0 && ny < n
                                        && map[ny][nx] > rain
                                        && !visited[ny][nx]) {
                                    visited[ny][nx] = true;
                                    q.add(new int[]{ny, nx});
                                }
                            }
                        }
                    }
                }
            }
            if (safe < check) {
                safe = check;
            }
        }
        System.out.println(safe);
    }
}
