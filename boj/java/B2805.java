import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        long m = Long.parseLong(s[1]);

        int left = 1;
        int right = 1;
        int[] trees = new int[n];

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int tree = Integer.parseInt(line[i]);
            if (tree > right) {
                right = tree;
            }
            trees[i] = tree;
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;
            for (int tree : trees) {
                int remind = tree - mid;
                if (remind > 0) {
                    sum += remind;
                }
            }
            if (sum >= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
