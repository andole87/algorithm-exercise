import java.util.*;

public class Search {
    private int[][] adj;

    public Search(int[][] adj) {
        this.adj = adj;
    }

    public List<Integer> dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> visited = new ArrayList<>();
        stack.add(start);
        while (!stack.isEmpty()) {
            int next = stack.pop();
            if (!visited.contains(next)) {
                visited.add(next);
                for (int i = 0; i < adj[start].length; i++) {
                    stack.add(adj[start][i]);
                }
            }
        }
        return visited;
    }

    public List<Integer> bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        boolean[] discoverd = new boolean[adj.length + 1];
        queue.add(start);
        while (!queue.isEmpty()) {
            int next = queue.poll();
            visited.add(next);
            for (int i : adj[next]) {
                if (!discoverd[i]) {
                    discoverd[i] = true;
                    queue.add(i);
                    for (int j = 0; j < adj[next].length; j++) {
                        queue.add(adj[next][j]);
                    }
                }
            }
        }
        return visited;
    }
}
