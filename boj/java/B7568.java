import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] people = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            people[i][0] = Integer.parseInt(line[0]);
            people[i][1] = Integer.parseInt(line[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (people[j][0] > people[i][0] && people[j][1] > people[i][1]) {
                        k++;
                    }
                }
            }
            sb.append(k + 1).append(" ");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}
