import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        dp[0] = numbers[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(numbers[i], dp[i - 1] + numbers[i]);
        }
        Arrays.stream(dp)
                .max()
                .ifPresent(System.out::println);
    }
}
