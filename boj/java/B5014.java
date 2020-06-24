import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B5014 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int f = Integer.parseInt(line[0]);
        int s = Integer.parseInt(line[1]);
        int g = Integer.parseInt(line[2]);
        int u = Integer.parseInt(line[3]);
        int d = Integer.parseInt(line[4]);

        int[] dir = {u, -d};
        int[] visited = new int[f + 1];

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = 1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int i = 0; i < 2; i++) {
                int next = curr + dir[i];
                if (next <= f && next > 0
                        && visited[next] == 0) {
                    q.add(next);
                    visited[next] = visited[curr] + 1;
                }
            }
        }
        if (visited[g] != 0) {
            System.out.println(visited[g] - 1);
        } else {
            System.out.println("use the stairs");
        }
    }
}
