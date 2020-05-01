import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B6603 {
    private static int cnt;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] s = br.readLine().split(" ");
            if (s.length == 1) {
                return;
            }
            int k = Integer.parseInt(s[0]);
            String[] numbers = new String[k];
            System.arraycopy(s, 1, numbers, 0, k);

            for (int i = 0; i < k - 5; i++) {
                cnt = 1;
                findLottoNum(i, numbers, numbers[i]);
            }

            System.out.print(sb.append("\n").toString());
            sb = new StringBuilder();
        }
    }

    public static void findLottoNum(int index, String[] numbers, String str) {
        if (6 == cnt) {
            sb.append(str).append("\n");
        } else {
            for (int i = index + 1; i < numbers.length; i++) {
                cnt++;
                findLottoNum(i, numbers, str + " " + numbers[i]);
            }
        }
        cnt--;
    }
}
