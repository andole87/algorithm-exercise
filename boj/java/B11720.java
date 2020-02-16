import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String input = reader.readLine();
        int sum = input.chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
