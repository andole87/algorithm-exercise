import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1874 {

    private static Stack<Integer> stack = new Stack<>();
    private static int[] numbers;
    private static int n;
    private static int i = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("+").append("\n");
        stack.add(1);
        for (int n : numbers) {
            while (true) {
                if (stack.isEmpty() || stack.peek() < n) {
                    stack.add(++i);
                    sb.append("+").append("\n");
                } else if (stack.peek() == n) {
                    stack.pop();
                    sb.append("-").append("\n");
                    break;
                } else if (stack.peek() > n) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
