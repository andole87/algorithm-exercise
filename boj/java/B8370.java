import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B8370 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n1 = Integer.parseInt(s[0]);
        int k1 = Integer.parseInt(s[1]);
        int n2 = Integer.parseInt(s[2]);
        int k2 = Integer.parseInt(s[3]);

        System.out.println(n1 * k1 + n2 * k2);
    }
}
