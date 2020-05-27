import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B2178 {
    private static int[][] road;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        road = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == '1') {
                    road[i][j] = 1;
                } else {
                    road[i][j] = 0;
                }
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Node> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        q.add(new Node(0, 0));
        visited[0][0] = 1;
        while (!q.isEmpty()) {
            Node next = q.poll();
            int x = next.getX();
            int y = next.getY();

            List<Node> around = next.around();
            for (Node node : around) {
                int nx = node.getX();
                int ny = node.getY();
                if (node.isInside() && road[ny][nx] == 1 && visited[ny][nx] == 0) {
                    q.add(node);
                    visited[ny][nx] = visited[y][x] + 1;
                }
            }
        }
        return visited[n - 1][m - 1];
    }

    private static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public List<Node> around() {
            List<Node> nodes = new ArrayList<>();
            if (x > 0 && y > 0) {
                nodes.add(new Node(x, y - 1));
                nodes.add(new Node(x, y + 1));
                nodes.add(new Node(x - 1, y));
                nodes.add(new Node(x + 1, y));
            } else if (x > 0) {
                nodes.add(new Node(x, y + 1));
                nodes.add(new Node(x - 1, y));
                nodes.add(new Node(x + 1, y));
            } else if (y > 0) {
                nodes.add(new Node(x, y - 1));
                nodes.add(new Node(x, y + 1));
                nodes.add(new Node(x + 1, y));
            } else {
                nodes.add(new Node(x, y + 1));
                nodes.add(new Node(x + 1, y));
            }
            return nodes;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean isInside() {
            return x < m && y < n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x &&
                    y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
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
