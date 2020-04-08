import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        boolean[] primes = new boolean[m + 1];
        primes[1] = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                continue;
            }
            if (i >= n) {
                sb.append(i).append("\n");
            }
            for (int j = i * 2; j <= m; j += i) {
                if (!primes[j]) {
                    primes[j] = true;
                }
            }
        }
        System.out.println(sb.toString());
    }
}