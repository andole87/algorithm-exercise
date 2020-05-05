import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10819 {
    private static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(s[i]);
        }
        permutation(numbers, 0);
        System.out.println(max);
    }

    private static void permutation(int[] arr, int depth) {
        if (depth == arr.length - 1) {
            sum(arr);
            return;
        }

        for (int i = depth; i < arr.length; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1);
            swap(arr, depth, i);
        }
    }

    private static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        if (max < sum) {
            max = sum;
        }
    }

    private static void swap(int[] arr, int depth, int n) {
        int temp = arr[depth];
        arr[depth] = arr[n];
        arr[n] = temp;
    }
}