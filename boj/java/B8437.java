import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B8437 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = Long.parseLong(br.readLine());
        long diff = Long.parseLong(br.readLine());

        long kla = (sum + diff) / 2;
        long nat = sum - kla;
        System.out.println(kla);
        System.out.println(nat);
    }
}
