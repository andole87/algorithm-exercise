import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class B1002 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int k = 0; k < t; k++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int r1 = Integer.parseInt(input[2]);

            int x2 = Integer.parseInt(input[3]);
            int y2 = Integer.parseInt(input[4]);
            int r2 = Integer.parseInt(input[5]);

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
                continue;
            }
            if (x1 == x2 && y1 == y2) {
                System.out.println(0);
                continue;
            }

            BigDecimal sqrt = BigDecimal.valueOf(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
            BigDecimal dist = BigDecimal.valueOf(r1 + r2);

            if (Math.max(r1, r2) == Math.min(r1, r2) + sqrt.longValue()) {
                System.out.println(1);
                continue;
            }

            if (sqrt.equals(dist)) {
                System.out.println(1);
                continue;
            }

            int compare = sqrt.compareTo(dist);
            if (compare > 0) {
                System.out.println(0);
            } else if (compare == 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
