import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class B11655 {
    public static void main(String[] args) throws IOException {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 97; i < 110; i++) {
            map.put((char) i, (char) (i + 13));
        }
        for (int i = 122; i > 109; i--) {
            map.put((char) i, (char) (i - 13));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(toUpperCase(map.getOrDefault(toLowerCase(c), c)));
                continue;
            }
            sb.append(map.getOrDefault(c, c));

        }
        System.out.println(sb.toString());
    }
}
