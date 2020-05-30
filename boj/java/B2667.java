import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B2667 {
    private static int n;
    private static boolean[][] map;
    private static boolean[][] visited;
    private static List<Integer> results = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new boolean[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                map[i][j] = line.charAt(j) == '1';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }
        System.out.println(results.size());
        StringBuilder sb = new StringBuilder();
        Collections.sort(results);
        for (int result : results) {
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void bfs(int i, int j) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(j, i));
        int count = 0;
        while (!q.isEmpty()) {
            Node next = q.poll();
            List<Node> around = next.around();
            for (Node node : around) {
                visited[node.y][node.x] = true;
                count++;
                q.add(node);
            }
        }
        results.add(count == 0 ? 1 : count);
    }

    private static class Node {
        private static final int[][] DIRECTION = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public List<Node> around() {
            List<Node> nodes = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                int dx = DIRECTION[i][0];
                int dy = DIRECTION[i][1];
                if (isValid(x + dx, y + dy)) {
                    nodes.add(new Node(x + dx, y + dy));
                }
            }
            return nodes;
        }

        public boolean isValid(int x, int y) {
            return x < n && y < n && x >= 0 && y >= 0
                    && !visited[y][x] && map[y][x];
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
