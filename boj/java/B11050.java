import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11050 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int i = fact(n, k) / fact(k, k);
        System.out.println(i);
    }

    public static int fact(int n, int k) {
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= n--;
        }
        return result;
    }
}
