import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10250 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int h = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);

            double last = (n + 0.0) / h;
            int first = n % h;
            if (first == 0) {
                first = h;
            }
            if (last % 2 != 0 && (last + 1) % 2 != 0) {
                last = Math.ceil(last);
            }

            StringBuilder sb = new StringBuilder();
            sb.append(first);
            if (last > 9) {
                sb.append((int) last);
            } else {
                sb.append("0").append((int) last);
            }
            System.out.println(sb.toString());
        }
    }
}
