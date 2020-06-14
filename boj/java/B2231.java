import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class B2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        int total = t.length();
        int n = Integer.parseInt(t);

        Queue<Integer> numbers = new PriorityQueue<>();
        for (int i = n - 9 * total; i < n; i++) {
            int count = i;
            int temp = i;
            while (temp > 0) {
                int mod = temp % 10;
                count += mod;
                temp = temp / 10;
            }
            if (count == n) {
                numbers.add(i);
            }
        }
        if (numbers.size() != 0) {
            System.out.println(numbers.poll());
        } else {
            System.out.println("0");
        }
    }
}
