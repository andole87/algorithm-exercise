import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String l = s[0];
        String r = s[1];

        int count = 0;
        if (l.length() == r.length()) {
            int range = Integer.parseInt(r) - Integer.parseInt(l);
            int bound = range == 0 ? 0 : String.valueOf(range).length();
            for (int i = 0; i < l.length() - bound; i++) {
                if (l.charAt(i) == '8' && r.charAt(i) == '8') {
                    count++;
                }
            }
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }
}
