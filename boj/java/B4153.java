import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bk = {"0", "0", "0"};
        while (true) {
            String[] s = br.readLine().split(" ");
            if (Arrays.equals(s, bk)) {
                break;
            }
            int[] n = new int[3];
            n[0] = Integer.parseInt(s[0]);
            n[1] = Integer.parseInt(s[1]);
            n[2] = Integer.parseInt(s[2]);
            Arrays.sort(n);
            if (Math.pow(n[2], 2) == Math.pow(n[1], 2) + Math.pow(n[0], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
