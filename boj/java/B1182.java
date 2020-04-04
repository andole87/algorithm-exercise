import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1182 {
    private static int count = 0;
    private static int s;
    private static int n;
    private static int[] numbers;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        n = Integer.parseInt(strings[0]);
        s = Integer.parseInt(strings[1]);
        numbers = new int[n];
        String[] token = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(token[i]);
        }
        dfs(0, 0);
        System.out.println(count);
    }

    private static void dfs(int index, int sum) {
        if (index == n) {
            return;
        }
        if (s == sum + numbers[index]) {
            count++;
        }
        dfs(index + 1, sum);
        dfs(index + 1, sum + numbers[index]);
    }
}
