import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B11503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        String[] s = br.readLine().split(" ");
        for (int j = 0; j < n; j++) {
            numbers[j] = Integer.parseInt(s[j]);
        }
        List<Integer> dp = new ArrayList<>();
        dp.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (dp.get(dp.size() - 1) < numbers[i]) {
                dp.add(numbers[i]);
            } else {
                int index = dp.size() - 1;
                while (index > 0) {
                    if (dp.get(index - 1) < numbers[i]) {
                        break;
                    }
                    index--;
                }
                dp.set(index, numbers[i]);
            }
        }
        System.out.println(dp.size());
    }
}
