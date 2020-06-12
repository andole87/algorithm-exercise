import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        Map<Integer, Integer> map = new HashMap<>();
        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
            map.putIfAbsent(number, 0);
            map.put(number, map.get(number) + 1);
        }
        Map.Entry[] entries = map.entrySet().toArray(new Map.Entry[0]);
        Arrays.sort(entries, (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return (int) a.getKey() - (int) b.getKey();
            }
            return (int) b.getValue() - (int) a.getValue();
        });
        int fre;
        if (entries.length > 1) {
            if (entries[0].getValue().equals(entries[1].getValue())) {
                fre = (int) entries[1].getKey();
            } else {
                fre = (int) entries[0].getKey();
            }
        } else {
            fre = (int) entries[0].getKey();
        }

        System.out.println(Math.round(sum / n));
        System.out.println(numbers[(n / 2)]);
        System.out.println(fre);
        System.out.println(Math.abs(numbers[0] - numbers[n - 1]));
    }
}
