import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11729 {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int) Math.pow(2, n) - 1);
        trans(n, 1, 3, 2);
        System.out.println(sb.toString());
    }

    private static void trans(int n, int from, int to, int aux) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        trans(n - 1, from, aux, to);
        sb.append(from).append(" ").append(to).append("\n");
        trans(n - 1, aux, to, from);
    }
}
