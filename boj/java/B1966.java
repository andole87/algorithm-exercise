import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int max = 0;
            Queue<int[]> q = new LinkedList<>();
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(line[j]);
                if (temp > max) {
                    max = temp;
                }
                q.add(new int[]{j, temp});
            }
            int count = 0;
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                if (curr[1] < max) {
                    q.add(curr);
                    continue;
                } else {
                    count++;
                    max = 0;
                    for (int[] next : q) {
                        if (next[1] > max) {
                            max = next[1];
                        }
                    }
                }
                if (curr[0] == m) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
