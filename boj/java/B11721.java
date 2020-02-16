import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 10 == 0 && i != 0) {
                sb.append("\n");
            }
            sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
