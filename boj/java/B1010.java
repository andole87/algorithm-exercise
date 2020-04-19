import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            System.out.println(combination(n, r));
        }
    }

    private static long combination(int n, int r) {
        if (n == r) {
            return 1;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = n; i > n - r; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= r; i++) {
            result = result.divide(BigInteger.valueOf(i));
        }
        return result.longValue();
    }
}
