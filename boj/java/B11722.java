import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B11722 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(s[i]);
        }
        List<Integer> dp = new ArrayList<>(n);
        dp.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (dp.get(dp.size() - 1) > numbers[i]) {
                dp.add(numbers[i]);
            } else {
                int index = dp.size() - 1;
                while (index > 0) {
                    if (dp.get(index - 1) > numbers[i]) {
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
