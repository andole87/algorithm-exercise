import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2667v2 {
    static int n;
    static boolean[][] visited;
    static boolean[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new boolean[n][n];
        visited = new boolean[n][n];
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                map[i][j] = line.charAt(j) == '1';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dfs = dfs(j, i);
                if (dfs != 0) {
                    results.add(dfs);
                }
            }
        }

        Collections.sort(results);
        StringBuilder sb = new StringBuilder();
        sb.append(results.size()).append("\n");
        for (int result : results) {
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int dfs(int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }
        if (x >= n || y >= n) {
            return 0;
        }
        if (visited[y][x]) {
            return 0;
        }
        if (!map[y][x]) {
            return 0;
        }
        visited[y][x] = true;
        return 1 + dfs(x - 1, y) + dfs(x + 1, y) + dfs(x, y - 1) + dfs(x, y + 1);
    }
}
