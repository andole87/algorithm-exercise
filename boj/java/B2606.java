import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<List<Integer>> computers = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            computers.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            computers.get(a).add(b);
            computers.get(b).add(a);
        }
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(1);

        while (!stack.empty()) {
            int key = stack.pop();
            List<Integer> integers = computers.get(key);
            for (Integer integer : integers) {
                if (!visited.contains(integer)) {
                    stack.add(integer);
                    visited.add(integer);
                }
            }
        }
        System.out.println(visited.size() - 1);
    }
}
