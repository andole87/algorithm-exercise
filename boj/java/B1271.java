import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        BigInteger total = new BigInteger(split[0]);
        BigInteger factor = new BigInteger(split[1]);
        System.out.println(total.divide(factor));
        System.out.println(total.mod(factor));
    }
}
