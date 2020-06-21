import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2869 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int v = Integer.parseInt(line[2]);

        if (a >= v) {
            System.out.println(1);

        } else {
            double temp = v - b + 0.0;
            int total = (int) Math.ceil(temp / (a - b));
            System.out.println(total);
        }
    }
}
