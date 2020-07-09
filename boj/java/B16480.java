import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B16480 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long R = Integer.parseInt(st.nextToken());
        long r = Integer.parseInt(st.nextToken());
        System.out.println(R * (R - 2 * r));
    }
}
