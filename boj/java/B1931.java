import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Session[] sessions = new Session[n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int start = Integer.parseInt(s[0]);
            int end = Integer.parseInt(s[1]);
            sessions[i] = new Session(start, end);
        }
        Arrays.sort(sessions, (a, b) -> {
            if (a.getEnd() == b.getEnd()) {
                return a.getStart() - b.getStart();
            }
            return a.getEnd() - b.getEnd();
        });
        Session last = sessions[0];
        int count = 1;
        for (int i = 1; i < sessions.length; i++) {
            Session current = sessions[i];
            if (last.getEnd() <= current.getStart()) {
                last = current;
                count++;
            }
        }
        System.out.println(count);
    }

    private static class Session {
        private int start;
        private int end;

        public Session(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "Session{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
