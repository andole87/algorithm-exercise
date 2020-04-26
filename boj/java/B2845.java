import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2845 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] areaVariable = br.readLine().split(" ");
        int area = Integer.parseInt(areaVariable[0]) * Integer.parseInt(areaVariable[1]);

        String[] sample = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : sample) {
            sb.append(Integer.parseInt(s) - area).append(" ");
        }
        System.out.println(sb.toString());
    }
}
