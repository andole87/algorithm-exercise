import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B15829 {
    private static final int prime = 1234567891;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long count = 0L;
        long k = 1L;
        String line = br.readLine();
        for (int i = 0; i < n; i++) {
            count += (line.charAt(i) - 96) * k;
            count %= prime;
            k *= 31;
            k %= prime;
        }
        System.out.println(count % prime);
    }
}
