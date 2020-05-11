import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B14652 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);

        System.out.println(k / n + " " + k % n);
    }
}
