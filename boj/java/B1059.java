import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1059 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] lucky = new int[N];
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            lucky[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(lucky);
        int index = 0;
        for (int i = 0; i < N; i++) {
            index = i;
            if (lucky[i] == n) {
                System.out.println(0);
                System.exit(0);
            }
            if (lucky[i] > n) {
                break;
            }
        }
        if (index == 0) {
            System.out.println((lucky[0] - n) * n - 1);
        } else {
            int ans = (lucky[index] - n) * (n - lucky[index - 1]) - 1;
            if (ans < 0) {
                ans = 0;
            }
            System.out.println(ans);
        }
    }
}
