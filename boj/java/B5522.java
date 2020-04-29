import java.io.IOException;
import java.util.Scanner;

public class B5522 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNextLine()) {
            result += Integer.parseInt(scanner.nextLine());
        }
        System.out.println(result);
    }
}
