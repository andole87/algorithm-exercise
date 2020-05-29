import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B2644 {
    private static int n, m, a, b;
    private static List<Integer>[] people;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        m = Integer.parseInt(br.readLine());
        people = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            people[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            people[a].add(b);
            people[b].add(a);
        }
        System.out.println(bfs(a, b));
    }

    private static int bfs(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[n + 1];
        q.add(start);
        visited[start] = 1;
        while (!q.isEmpty()) {
            int next = q.poll();
            if (next == end) {
                break;
            }
            for (int i = 0; i < people[next].size(); i++) {
                int t = people[next].get(i);
                if (visited[t] == 0) {
                    visited[t] = visited[next] + 1;
                    q.add(t);
                }
            }
        }
        return visited[end] - 1;
    }
}
