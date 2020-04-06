import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int i1 = toInt(s.charAt(i));
            int position = (int) Math.pow(16, s.length() - i - 1);
            result += i1 * position;
        }
        System.out.println(result);
    }

    private static int toInt(Character c) {
        switch (c) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(c.toString());
        }
    }
}
