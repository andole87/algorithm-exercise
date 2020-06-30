import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class B10866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            if (command.length == 1) {
                switch (command[0]) {
                    case "front":
                        if (q.isEmpty()) {
                            sb.append("-1").append("\n");
                        } else {
                            sb.append(q.peekFirst()).append("\n");
                        }
                        break;
                    case "back":
                        if (q.isEmpty()) {
                            sb.append("-1").append("\n");
                        } else {
                            sb.append(q.peekLast()).append("\n");
                        }
                        break;
                    case "empty":
                        if (q.isEmpty()) {
                            sb.append("1").append("\n");
                        } else {
                            sb.append("0").append("\n");
                        }
                        break;
                    case "size":
                        sb.append(q.size()).append("\n");
                        break;
                    case "pop_back":
                        if (q.isEmpty()) {
                            sb.append("-1").append("\n");
                        } else {
                            sb.append(q.pollLast()).append("\n");
                        }
                        break;
                    case "pop_front":
                        if (q.isEmpty()) {
                            sb.append("-1").append("\n");
                        } else {
                            sb.append(q.pollFirst()).append("\n");
                        }
                        break;
                }
            } else {
                switch (command[0]) {
                    case "push_front":
                        q.addFirst(command[1]);
                        break;
                    case "push_back":
                        q.addLast(command[1]);
                        break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
