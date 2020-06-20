import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MAX_VALUE;
        for (int i = 0; 5 * i <= n; i++) {
            int j = 0;
            while (true) {
                int temp = 5 * i + j * 3;
                if (temp > n) {
                    break;
                }
                if (temp == n) {
                    if (max > (i + j)) {
                        max = i + j;
                    }
                }
                j++;
            }
        }
        if (max == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(max);
        }
    }
}
