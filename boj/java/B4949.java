import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (".".equals(line)) {
                break;
            }
            System.out.println(check(line));
        }
    }

    private static String check(String line) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '[' || c == '(') {
                stack.add(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                stack.pop();
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
