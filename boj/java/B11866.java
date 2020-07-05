import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B11866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]) - 1;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!list.isEmpty()) {
            index = (index + k) % list.size();
            int i = list.get(index);
            list.remove(index);
            sb.append(i).append(", ");
        }
        sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).append(">");
        System.out.println(sb.toString());
    }
}
