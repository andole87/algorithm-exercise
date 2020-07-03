import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B11651 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            p[i][0] = Integer.parseInt(s[0]);
            p[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(p, (a, b) -> {
            if (b[1] == a[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int[] ints : p) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
