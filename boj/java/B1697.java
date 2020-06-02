import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1697 {

    private static int x;
    private static int m;
    private static int time;
    private static int[] visited = new int[100_001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        x = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        if (x == m) {
            System.out.println(0);
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = 1;
        int size, c;
        while (!q.isEmpty()) {
            size = q.size();
            for (int i = 0; i < size; i++) {
                c = q.poll();
                if (c == m) {
                    System.out.println(time);
                    return;
                }
                for (int n : next(c)) {
                    if (visited[n] == 0) {
                        q.add(n);
                        visited[n] = 1;
                    }
                }
            }
            time++;
        }
        System.out.println(time);
    }

    private static int[] next(int current) {
        int[] nodes = new int[3];
        nodes[0] = valid(current - 1);
        nodes[1] = valid(current + 1);
        nodes[2] = valid(current * 2);
        return nodes;
    }

    private static int valid(int n) {
        if (n > 100000 || n < 0) {
            return 0;
        }
        return n;
    }
}
