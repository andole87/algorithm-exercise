import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B11726 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Map<Integer, Long> dp = new HashMap<>();
        dp.put(1, 1L);
        dp.put(2, 2L);
        for (int i = 3; i <= n; i++) {
            dp.put(i, (dp.get(i - 1) + dp.get(i - 2)) % 10007);
        }
        System.out.println(dp.get(n));
    }
}