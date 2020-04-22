import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1676 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (n != 0) {
            n = n / 5;
            count += n;
        }
        System.out.println(count);
    }
}
