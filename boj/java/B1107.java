import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1107 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int total = temp.length();
        int n = Integer.parseInt(temp);
        int k = Integer.parseInt(br.readLine());
        boolean[] keys = new boolean[10];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            int number = Integer.parseInt(s[i]);
            keys[number] = true;
        }

    }
}
