import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] primes = primes(123456 * 2);
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                return;
            }
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i += 2) {
                if (i % 2 == 0) {
                    i++;
                }
                if (!primes[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean[] primes(int n) {
        boolean[] primes = new boolean[n + 1];
        primes[1] = true;
        for (int i = 2; i < n / 2 + 1; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j < n + 1; j += i) {
                    primes[j] = true;
                }
            }
        }
        return primes;
    }
}
