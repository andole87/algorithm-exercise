import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1259 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                return;
            }
            check(line);
        }
    }

    private static void check(String line) {
        int n = line.length();
        for (int i = 0; i < n / 2; i++) {
            if (line.charAt(i) != line.charAt(n - 1 - i)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
