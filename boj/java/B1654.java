import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        int[] lan = new int[k];
        for (int i = 0; i < k; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }

        long left = 0;
        long right = Integer.MAX_VALUE;
        long max = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            int result = 0;
            for (int i = 0; i < lan.length; i++) {
                result += lan[i] / mid;
            }
            if (result >= n) {
                left = mid + 1;
                if (mid > max) {
                    max = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        System.out.println(max);
    }
}
