import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        String[] s = input.split(" ");
        int sum = Arrays.stream(s)
                .map(B1357::reverse)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(Integer.parseInt(reverse(String.valueOf(sum))));
    }

    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}
