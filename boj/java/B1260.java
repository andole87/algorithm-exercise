import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class B1260 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int start = Integer.parseInt(s[2]);

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        for (List<Integer> list : adj) {
            Collections.sort(list);
        }
        String collect = dfs(adj, start).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(collect);

        System.out.println(bfs(adj, start).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    private static List<Integer> dfs(List<List<Integer>> adj, int start) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> visited = new ArrayList<>();
        boolean[] discovered = new boolean[adj.size()];
        stack.add(start);
        while (!stack.isEmpty()) {
            int next = stack.pop();
            if (!discovered[next]) {
                discovered[next] = true;
                visited.add(next);
                for (int i = adj.get(next).size() - 1; i >= 0; i--) {
                    stack.add(adj.get(next).get(i));
                }
            }
        }
        return visited;
    }

    private static List<Integer> bfs(List<List<Integer>> adj, int start) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        boolean[] discovered = new boolean[adj.size()];
        queue.add(start);
        discovered[start] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited.add(curr);
            for (int i = 0; i < adj.get(curr).size(); i++) {
                int next = adj.get(curr).get(i);
                if (!discovered[next]) {
                    discovered[next] = true;
                    queue.add(next);
                }
            }
        }
        return visited;
    }
}
