import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1012 {
    private static final int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private static int t;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int count = 0;

            boolean[][] map = new boolean[y][x];

            for (int j = 0; j < k; j++) {
                String[] p = br.readLine().split(" ");
                int tx = Integer.parseInt(p[0]);
                int ty = Integer.parseInt(p[1]);
                map[ty][tx] = true;
            }
            for (int j = 0; j < y; j++) {
                for (int l = 0; l < x; l++) {
                    if (map[j][l]) {
                        count++;
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[]{j, l});
                        map[j][l] = false;
                        while (!q.isEmpty()) {
                            int[] curr = q.poll();
                            for (int m = 0; m < 4; m++) {
                                int ny = curr[0] + dir[m][0];
                                int nx = curr[1] + dir[m][1];
                                if (ny >= 0 && ny < y
                                        && nx >= 0 && nx < x
                                        && map[ny][nx]) {
                                    map[ny][nx] = false;
                                    q.add(new int[]{ny, nx});
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
