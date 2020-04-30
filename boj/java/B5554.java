import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B5554 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int raw = 0;
        for (int i = 0; i < 4; i++) {
            raw += Integer.parseInt(br.readLine());
        }

        int minute = raw / 60;
        int second = raw % 60;
        System.out.println(minute);
        System.out.println(second);
    }
}
