import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B3003 {
    private static final int[] PIECES = new int[]{1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] pieces = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < PIECES.length; i++) {
            sb.append(PIECES[i] - Integer.parseInt(pieces[i])).append(" ");
        }
        System.out.println(sb.toString());
    }
}
