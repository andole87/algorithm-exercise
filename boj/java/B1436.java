import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int i = 665;
        while (true) {
            i++;
            int temp = i;
            while (temp / 100 > 0) {
                if (temp % 1000 == 666) {
                    count++;
                    break;
                }
                temp = temp / 10;
            }
            if (count == n) {
                System.out.println(i);
                return;
            }
        }
    }
}
