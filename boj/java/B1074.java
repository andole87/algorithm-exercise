import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1074 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        System.out.println(find(n, c, r));
    }

    private static int find(int n, int r, int c) {
        if (n == 1) {
            if (r == 0 && c == 0) {
                return 0;
            } else if (r == 1 && c == 0) {
                return 1;
            } else if (r == 0 && c == 1) {
                return 2;
            } else {
                return 3;
            }
        }

        int mid = (int) Math.pow(2, n - 1);
        if (r >= mid && c >= mid) {
            return 3 * (int) Math.pow(mid, 2) + find(n - 1, r - mid, c - mid);
        } else if (r >= mid && c < mid) {
            return (int) Math.pow(mid, 2) + find(n - 1, r - mid, c);
        } else if (r < mid && c >= mid) {
            return 2 * (int) Math.pow(mid, 2) + find(n - 1, r, c - mid);
        } else {
            return find(n - 1, r, c);
        }
    }
}
